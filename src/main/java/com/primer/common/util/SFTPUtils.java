package com.primer.common.util;

import com.jcraft.jsch.*;
import org.apache.commons.vfs.FileSystemException;
import org.apache.commons.vfs.FileSystemOptions;
import org.apache.commons.vfs.provider.sftp.SftpClientFactory;
import org.apache.commons.vfs.provider.sftp.SftpFileSystemConfigBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.lang.reflect.Field;
import java.util.Vector;
import java.util.function.Predicate;
import java.util.regex.Pattern;

/**
 * @ClassName: SFTPUtil
 * @Description: SFTP工具类
 * @date:2018年12月18日 下午5:29:39
 * @author:ludayong
 */
public class SFTPUtils {
	private static Logger logger = LoggerFactory.getLogger(SFTPUtils.class);

	private ChannelSftp channel;

	private Session session;

	/** sftp用户名 */
	private String userName;
	/** sftp密码 */
	private String password;
	/** sftp主机ip */
	private String ftpHost;
	/** sftp主机端口 */
	private int ftpPort;

	/**
	 * 默认构造方法
	 */
	public SFTPUtils() {
	}

	/**
	 * @Description: 连接SFTP服务器
	 * @Parmaters: @param userName 用户名
	 * @Parmaters: @param password 密码
	 * @Parmaters: @param ftpHost IP地址
	 * @Parmaters: @param ftpPort 端口
	 * @Parmaters: @throws JSchException
	 * @Parmaters: @throws FileSystemException
	 * @Throws:
	 * @date:2018年12月18日 下午5:29:39
	 * @author:ludayong
	 */
	public SFTPUtils(String userName, String password, String ftpHost, int ftpPort) throws JSchException, FileSystemException {
		this.userName = userName;
		this.password = password;
		this.ftpHost = ftpHost;
		this.ftpPort = ftpPort;
		logger.info("SFTP连接信息: " + "userName=" + userName + ", " + "password=******" + ", " + "ftpHost=" + ftpHost + ", " + "ftpPort="
				+ ftpPort);
		connectServer();
	}

	/**
	 * @Title: finalize
	 * @Description: 断开连接 V0.x：变更时间：变更描述
	 * @Parmaters: @throws Throwable
	 * @Return: void
	 * @Throws:
	 * @date:2018年12月18日 下午5:29:39
	 * @author:ludayong
	 */
	@Override
	protected void finalize() throws Throwable {
		this.disconnect();
		super.finalize();
	}

	/**
	 * @Title: closeSFTP
	 * @Description: sftp连接断开 V0.x：变更时间：变更描述
	 * @Return: void
	 * @Throws:
	 * @date:2018年12月18日 下午5:29:39
	 * @author:ludayong
	 */
	public void closeSFTP() {
		this.disconnect();
	}

	/**
	 * @Title: downFile
	 * @Description: 从SFTP上下载文件到本地
	 * @Parmaters: @param sftp sftp工具类
	 * @Parmaters: @param remotePath 远程服务器文件路径
	 * @Parmaters: @param remoteFile sftp服务器文件名
	 * @Parmaters: @param localFile 下载到本地的文件路径和名称
	 * @Parmaters: @param closeFlag true 表示关闭连接 false 表示不关闭连接
	 * @Parmaters: @return flag 下载是否成功, true-下载成功, false-下载失败
	 * @Parmaters: @throws Exception
	 * @Return: boolean
	 * @Throws:
	 * @date:2018年12月18日 下午5:29:39
	 * @author:ludayong
	 */
	public synchronized boolean downFile(SFTPUtils sftp, String remotePath, String remoteFile, String localFile, boolean closeFlag)
			throws Exception {
		boolean flag = false;
		InputStream input = null;
		FileOutputStream out = null;
		try {
			this.channel.cd(remotePath);
			input = this.channel.get(remoteFile);

			// 判断本地目录是否存在, 若不存在就创建文件夹
			if (localFile != null && !"".equals(localFile)) {
				File checkFileTemp = new File(localFile);
				if (!checkFileTemp.getParentFile().exists()) {
					// 创建文件夹, 如：在f盘创建/TXT文件夹/testTXT/两个文件夹
					checkFileTemp.getParentFile().mkdirs();
				}
			} else {
				return flag;
			}

			out = new FileOutputStream(new File(localFile));
			byte[] bt = new byte[1024];
			int length = -1;
			while ((length = input.read(bt)) != -1) {
				out.write(bt, 0, length);
			}
			if (closeFlag) {
				sftp.disconnect();
			}
			flag = true;
		} catch (SftpException e) {
			logger.error("文件下载失败！" + e.getMessage());
			e.printStackTrace();
			throw new RuntimeException("文件下载失败！" + e.getMessage());
		} catch (FileNotFoundException e) {
			logger.error("下载文件到本地的路径有误！" + e.getMessage());
			e.printStackTrace();
			throw new RuntimeException("下载文件到本地的路径有误！");
		} catch (IOException e) {
			logger.error("文件写入有误！" + e.getMessage());
			e.printStackTrace();
			throw new RuntimeException("文件写入有误！");
		} finally {
			if (input != null) {
				input.close();
			}
			if (out != null) {
				out.close();
			}
		}

		return flag;
	}

	/**
	 * @Title: downFile
	 * @Description:下载文件
	 * @Parmaters: @param sftp sftp工具类
	 * @Parmaters: @param remotePath 远程服务器文件路径
	 * @Parmaters: @param remoteFile sftp服务器文件名
	 * @Parmaters: @param localFilePath 下载到本地的文件路径
	 * @Parmaters: @param localFileName 下载到本地的文件名称
	 * @Parmaters: @param closeFlag true 表示关闭连接 false 表示不关闭连接
	 * @Parmaters: @return 下载是否成功, true-下载成功, false-下载失败
	 * @Parmaters: @throws Exception
	 * @Return: boolean
	 * @Throws:
	 * @date:2018年12月18日 下午5:29:39
	 * @author:ludayong
	 */
	public synchronized boolean downFile(SFTPUtils sftp, String remotePath, String remoteFileName, String localFilePath,
                                         String localFileName, boolean closeFlag) throws Exception {
		boolean flag = false;
		InputStream input = null;
		FileOutputStream out = null;
		try {
			// this.channel.cd(remotePath);
			input = this.channel.get(remotePath + remoteFileName);
			String localRemoteFile = localFilePath + remoteFileName;
			File checkFileTemp = null;
			// 判断本地目录是否存在, 若不存在就创建文件夹
			if (localRemoteFile != null && !"".equals(localRemoteFile)) {
				checkFileTemp = new File(localRemoteFile);
				if (!checkFileTemp.getParentFile().exists()) {
					// 创建文件夹, 如：在f盘创建/TXT文件夹/testTXT/两个文件夹
					checkFileTemp.getParentFile().mkdirs();
				}
			} else {
				return flag;
			}

			out = new FileOutputStream(new File(localRemoteFile));
			byte[] bt = new byte[1024];
			int length = -1;
			while ((length = input.read(bt)) != -1) {
				out.write(bt, 0, length);
			}
			if (closeFlag) {
				sftp.disconnect();
			}
			flag = true;

			// 下载后的文件重命名
			File upSupFile = new File(localFilePath + localFileName);
			if (checkFileTemp != null) {
				checkFileTemp.renameTo(upSupFile);
			}
		} catch (SftpException e) {
			logger.error("文件下载失败！" + e.getMessage());
			e.printStackTrace();
			throw new RuntimeException("文件下载失败！");
		} catch (FileNotFoundException e) {
			logger.error("下载文件到本地的路径有误！" + e.getMessage());
			e.printStackTrace();
			throw new RuntimeException("下载文件到本地的路径有误！");
		} catch (IOException e) {
			logger.error("文件写入有误！" + e.getMessage());
			e.printStackTrace();
			throw new RuntimeException("文件写入有误！");
		} finally {
			if (input != null) {
				input.close();
			}
			if (out != null) {
				out.close();
			}
		}
		return flag;
	}

	/**
	 * @Title: upFile
	 * @Description: 上传文件到SFTP服务器
	 * @Parmaters: @param remotePath sftp服务器路径
	 * @Parmaters: @param fileName sftp服务器文件名
	 * @Parmaters: @param localFile 本地文件路径和名称字符串
	 * @Parmaters: @param closeFlag 是否要关闭本次SFTP连接: true-关闭, false-不关闭
	 * @Parmaters: @param filePathFlag 是否要创建远程的指定目录: true-创建, false-不创建
	 * @Parmaters: @return
	 * @Parmaters: @throws Exception
	 * @Return: boolean
	 * @Throws:
	 * @date:2018年12月18日 下午5:29:39
	 * @author:ludayong
	 */
	public synchronized boolean upFile(String remotePath, String fileName, String localFile, boolean closeFlag, boolean filePathFlag)
			throws Exception {
		boolean flag = false;
		InputStream input = null;
		try {
			input = new FileInputStream(localFile);

			// 判断是否要在远程目录上创建对应的目录
			if (filePathFlag) {
				String[] dirs = remotePath.split("\\/");
				if (dirs == null || dirs.length < 1) {
					dirs = remotePath.split("\\\\");
				}

				String now = this.channel.pwd();// 获取当前目录
				this.channel.cd("/"); // 切换到根目录
				for (int i = 0; i < dirs.length; i++) {
					if (dirs[i] != null && !"".equals(dirs[i])) {
						boolean dirExists = false;
						try {
							dirExists = this.openDirs(dirs[i]);
						} catch (Exception e) {
						}
						if (!dirExists) {
							this.channel.mkdir(dirs[i]);// 创建目录
							this.channel.cd(dirs[i]);// 切换到对应目录
						}
					}
				}
				this.channel.cd(now);// 重新切换到上文当前目录
			}

			this.channel.cd(remotePath);// 切换到sftp服务器路径
			this.channel.put(input, fileName);
			this.channel.chmod(444, fileName);// 设置文件权限
			flag = true;
		} catch (SftpException e) {
			logger.error("文件上传失败！" + e.getMessage());
			e.printStackTrace();
			throw new RuntimeException("文件上传失败！" + e.getMessage());
		} catch (FileNotFoundException e) {
			logger.error("FileNotFoundException 上传文件找不到！" + e.getMessage());
			e.printStackTrace();
			throw new RuntimeException("上传文件路径有误！" + e.getMessage());
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (Exception e) {
					logger.error("输入流关闭失败" + e.getMessage());
					e.printStackTrace();
				}
			}
			// 判断是否要关闭本次SFTP连接
			if (closeFlag) {
				disconnect();
			}
		}

		return flag;
	}

	/**
	 * @Title: connectServer
	 * @Description: 连接SFTP服务器
	 * @Parmaters: @throws JSchException
	 * @Parmaters: @throws FileSystemException
	 * @Return: void
	 * @Throws:
	 * @date:2018年12月18日 下午5:29:39
	 * @author:ludayong
	 */
	private synchronized void connectServer() throws JSchException, FileSystemException {
		if (this.channel != null) {
			disconnect();
		}
		FileSystemOptions fso = new FileSystemOptions();
		SftpFileSystemConfigBuilder.getInstance().setStrictHostKeyChecking(fso, "no");

		logger.info("SFTP连接正在创建Session... ...");
		this.session = SftpClientFactory.createConnection(this.ftpHost, this.ftpPort, this.userName.toCharArray(),
				this.password.toCharArray(), fso);
		logger.info("SFTP连接Session创建成功");

		logger.info("SFTP连接正在打开SFTP通道... ...");
		Channel _channel = this.session.openChannel("sftp");
		logger.info("SFTP连接通道打开成功");

		logger.info("SFTP连接中... ...");
		_channel.connect();
		logger.info("SFTP连接成功");

		this.channel = ((ChannelSftp) _channel);
	}

	/**
	 * @Title: disconnect
	 * @Description: 关闭连接
	 * @Return: void
	 * @Throws:
	 * @date:2018年12月18日 下午5:29:39
	 * @author:ludayong
	 */
	private synchronized void disconnect() {
		// logger.info("SFTP连接正在关闭SFTP通道... ...");
		if (this.channel != null) {
			this.channel.exit();
		}
		logger.info("SFTP连接通道关闭成功");
		// logger.info("SFTP连接正在退出Session... ...");
		if (this.session != null) {
			this.session.disconnect();
		}
		logger.info("SFTP连接退出Session成功");
		this.channel = null;
	}

	/**
	 * @Title: downFile
	 * @Description: 下载文件
	 * @Parmaters: @param remotePath sftp服务器路径
	 * @Parmaters: @param remoteFile sftp服务器文件名
	 * @Parmaters: @return
	 * @Parmaters: @throws Exception
	 * @Return: InputStream
	 * @Throws:
	 * @date:2018年12月18日 下午5:29:39
	 * @author:ludayong
	 */
	public synchronized InputStream downFile(String remotePath, String remoteFile) throws Exception {
		try {
			this.channel.cd(remotePath);
			return this.channel.get(remoteFile);
		} catch (SftpException e) {
			logger.error("文件下载失败！" + e.getMessage());
			e.printStackTrace();
			throw new Exception("文件下载失败", e);
		}
	}

	/**
	 * @Title: openDirs
	 * @Description: 打开指定目录
	 * @Parmaters: @param directory
	 * @Parmaters: @return
	 * @Return: boolean 是否打开目录
	 * @Throws:
	 * @Author:ludayong
	 * @CreateDate:2018-12-18 下午5:14:51
	 * @Version:0.1
	 * @ModifyLog:2018-12-18 下午5:14:51
	 */
	public synchronized boolean openDirs(String directory) {
		try {
			this.channel.cd(directory);
			return true;
		} catch (SftpException e) {
			return false;
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * @throws Exception
	 * @Title: checkSFTPFile
	 * @Description: 检查远程SFTP服务端文件是否存在
	 * @Parmaters: @param remoteFolder 远程文件路径
	 * @Parmaters: @param fileName 文件名
	 * @Parmaters: @param flag 是否关闭SFTP连接
	 * @Parmaters: @return
	 * @Parmaters: @throws Exception
	 * @Return: boolean
	 * @Throws:
	 * @date:2018年12月18日 下午5:29:39
	 * @author:ludayong
	 */
	public synchronized boolean checkSFTPFile(String remoteFolder, String remoteFileName, Boolean closeFlag) throws Exception {
		boolean flag = false;
		try {
			if (!this.openDirs(remoteFolder)) {// 判断是否存在远程文件目录
				logger.info("SFTP远程文件目录" + remoteFolder + "不存在！！！");
				return flag;
			}
			// 信号文件匹配
			Pattern pattern = Pattern.compile(remoteFileName);
			// 检查文件是否存在
			Vector<ChannelSftp.LsEntry> files = this.ls(remoteFolder);
			for (ChannelSftp.LsEntry file : files) {
				if (file.getFilename().equals(remoteFileName) || pattern.matcher(file.getFilename()).find()) {// 文件名相同或匹配到
					/*
					 * 此处防止此种情况:需要下载Name_*数据文件,但是会匹配到SomeString_Name_*文件,导致数据文件无法下载
					 */
					int count = (int) pattern.splitAsStream(file.getFilename()).filter(new Predicate<String>() {// 过滤掉空字符串
						@Override
						public boolean test(String arg0) {
							return !"".equals(arg0);
						}
					}).count();
					if (count != StringUtils.countForStr(remoteFileName, "[*]")) {
						flag = false;
						continue;
					} else {
						flag = true;
					}
				}
			}
			logger.info("SFTP远程文件" + remoteFolder + remoteFileName + (flag ? "存在" : "不存在"));
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			if (closeFlag) {
				this.disconnect();
				;
			}
		}
		return flag;
	}

	/**
	 * @throws Exception
	 * @Title: checkSFTPFile
	 * @Description: 检查远程SFTP服务端文件是否存在
	 * @Parmaters: @param remoteFolder 远程文件路径
	 * @Parmaters: @param signArray 信号文件组
	 * @Parmaters: @param flag 是否关闭SFTP连接
	 * @Parmaters: @return
	 * @Parmaters: @throws Exception
	 * @Return: boolean
	 * @Throws:
	 * @date:2018年12月18日 下午5:29:39
	 * @author:ludayong
	 */
	public synchronized boolean checkSFTPFile(String remoteFolder, String[] signArray, Boolean closeFlag) throws Exception {
		boolean flag = false;
		boolean flag1 = false;
		boolean flag2 = true;
		try {
			if (!this.openDirs(remoteFolder)) {// 判断是否存在远程文件目录
				logger.info("SFTP远程文件目录" + remoteFolder + "不存在！！！");
				return flag;
			}
			for (String signFileName : signArray) {
				flag1 = false;
				// 检查文件是否存在
				Vector<ChannelSftp.LsEntry> files = this.ls(remoteFolder);
				for (ChannelSftp.LsEntry file : files) {
					if (file.getFilename().equals(signFileName)) {// 文件名相同
						flag1 = true;
					}
				}
				if (!flag1) {
					flag2 = false;
				}
				logger.info("SFTP远程文件" + remoteFolder + signFileName + (flag1 ? "存在" : "不存在"));
				logger.info("---------------------------------------->>>>>>>>>>" + signFileName + ":" + flag1);
			}
			if (flag2) { // 如果信号文件都存在，返回正确
				flag = flag2;
			}
			logger.info("---------------------------------------->>>>>>>>>>>>>" + flag);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			if (closeFlag) {
				this.disconnect();
			}
		}
		return flag;
	}

	/**
	 * @Title: ls
	 * @Description: 查看指定目录下文件<br>
	 *               V0.x：变更时间：变更描述
	 * @Parmaters: @param directory
	 * @Parmaters: @return
	 * @Parmaters: @throws Exception
	 * @Return: Vector
	 * @Throws:
	 * @date:2018年12月18日 下午5:29:39
	 * @author:ludayong
	 */
	@SuppressWarnings("unchecked")
	public synchronized Vector<ChannelSftp.LsEntry> ls(String directory) throws Exception {
		try {
			Class<ChannelSftp> c = ChannelSftp.class;
			Field field = c.getDeclaredField("server_version");
			field.setAccessible(true);
			field.set(channel, 2);
			channel.setFilenameEncoding("GBK");// 避免中文乱码
			return this.channel.ls(directory);
		} catch (SftpException e) {
			e.printStackTrace();
			logger.error("查看指定目录" + directory + "下文件失败" + e.getMessage());
			throw new Exception(e.getMessage(), e);
		}
	}

	/**
	 * @throws JSchException
	 * @throws FileSystemException
	 * @Title: isNew
	 * @Description: 根据用户名,主机名判断是否已经存在连接<br>
	 *               V0.x：变更时间：变更描述
	 * @Parmaters: @param userName
	 * @Parmaters: @param ftpHost
	 * @Parmaters: @param ftpPort
	 * @Parmaters: @return
	 * @Return: boolean
	 * @Throws:
	 * @date:2018年12月18日 下午5:29:39
	 * @author:ludayong
	 */
	public boolean isNew(String userName, String ftpHost) throws FileSystemException, JSchException {
		if (userName.equals(this.userName) && ftpHost.equals(this.ftpHost)) {
			if (this.channel == null || this.channel.isClosed()) {// 如果已经关闭连接,则重新连接
				this.connectServer();
			}
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 重命名文件
	 * 
	 * @param oldPath
	 *            原路径
	 * @param fileName
	 *            文件名
	 * @param newPath
	 *            新路径
	 * @param closeFlag
	 *            是否要关闭本次SFTP连接: true-关闭, false-不关闭
	 * @param filePathFlag
	 *            是否要创建远程的指定目录: true-创建, false-不创建
	 * @return
	 * @throws Exception
	 */
	public synchronized boolean renameFile(String oldPath, String fileName, String newPath, boolean closeFlag, boolean filePathFlag)
			throws Exception {
		boolean flag = false;
		try {
			// 判断是否要在远程目录上创建对应的目录
			if (filePathFlag) {
				String[] dirs = newPath.split("\\/");
				if (dirs == null || dirs.length < 1) {
					dirs = newPath.split("\\\\");
				}

				String now = this.channel.pwd();// 获取当前目录
				this.channel.cd("/"); // 切换到根目录
				for (int i = 0; i < dirs.length; i++) {
					if (dirs[i] != null && !"".equals(dirs[i])) {
						boolean dirExists = false;
						try {
							dirExists = this.openDirs(dirs[i]);
						} catch (Exception e) {
						}
						if (!dirExists) {
							this.channel.mkdir(dirs[i]);// 创建目录
							this.channel.cd(dirs[i]);// 切换到对应目录
						}
					}
				}
				this.channel.cd(now);// 重新切换到上文当前目录
			}
			if (this.checkSFTPFile(oldPath, fileName, false)) {// 校验文件是否存在
				this.channel.cd(oldPath);// 切换到sftp服务器路径
				this.channel.rename(oldPath + fileName, newPath + fileName);
			}
			flag = true;
		} catch (Exception e) {
			logger.error("重命名文件失败，异常信息：" + e.getMessage());
			e.printStackTrace();
			throw new RuntimeException("重命名文件失败！" + e.getMessage());
		} finally {
			// 判断是否要关闭本次SFTP连接
			if (closeFlag) {
				disconnect();
			}
		}
		return flag;
	}

}
