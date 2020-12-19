package com.primer.bean;

import com.primer.entity.GitlabProjectConfig;
import lombok.Data;
import org.gitlab4j.api.models.Commit;

import java.util.ArrayList;

@Data
public class CommitInfo {
    /**
     * 项目信息
     */
    private GitlabProjectConfig gitlabProjectConfig;
    /**
     * 提交文件
     */
    private ArrayList<String> commitFiles;
    /**
     * 提交信息
     */
    private ArrayList<String> commitMessages;

    /**
     * gitlab  commit对象
     */
    private ArrayList<Commit> commits;

}
