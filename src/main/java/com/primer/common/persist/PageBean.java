package com.primer.common.persist;


import java.util.ArrayList;
import java.util.List;

/**
 * 分页
 *
 * @param <T>
 */

public class PageBean<T> {

    /**
     * 默认第一页
     */
    private Integer pageindex = 1;

    /**
     * 默认每页十条记录
     */
    private Integer pagesize = 10;

    /**
     * 总记录数
     */
    private Integer count;

    /**
     * 总页数
     */
    private Integer total;

    /**
     * 当前页码
     */
    private Integer currentPage;

    /**
     * 对象集合
     */
    private List<T> list = new ArrayList<T>();
    /**
     * 是否有前一页
     */
    private boolean pre;
    /**
     * 是否有下一页
     */
    private boolean next;
    /**
     * sql
     */
    private String whereSQL;
    /**
     * 结果
     */
    private Integer resultCode;
    /**
     * 是否成功
     */
    private boolean success;

    public Integer getResultCode()
    {
        return resultCode;
    }

    public void setResultCode(Integer resultCode)
    {
        this.resultCode = resultCode;
    }

    public boolean isSuccess()
    {
        return success;
    }

    public void setSuccess(boolean success)
    {
        this.success = success;
    }

    public String getWhereSQL()
    {
        return whereSQL;
    }

    public void setWhereSQL(String whereSQL)
    {
        this.whereSQL = whereSQL;
    }

    public Integer getCurrentPage()
    {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage)
    {
        this.currentPage = currentPage;
    }

    public List<T> getList()
    {
        return list;
    }

    public void setList(List<T> list)
    {
        this.list = list;
    }

    public Integer getPageindex()
    {
        return pageindex;
    }

    public void setPageindex(Integer pageindex)
    {
        this.pageindex = pageindex;
    }

    public Integer getPagesize()
    {
        return pagesize;
    }

    public void setPagesize(Integer pagesize)
    {
        this.pagesize = pagesize;
    }

    public Integer getCount()
    {
        return count;
    }

    public void setCount(Integer count)
    {
        this.count = count;
    }

    /**
     * 得到总页数
     * @return 结果
     */
    public Integer getTotal()
    {
        total = (count % pagesize == 0) ? (count / pagesize)
                : (count / pagesize + 1);
        return total;
    }

    public void setTotal(Integer total)
    {
        this.total = total;
    }

    /**
     * 返回是否有前一页
     * @return 结果
     */
    public boolean isPre()
    {
        pre = pageindex > 1;
        return pre;
    }

    public void setPre(boolean pre)
    {
        this.pre = pre;
    }

    /**
     * 是否有下一页
     * @return 结果
     */
    public boolean isNext()
    {
        next = pageindex < this.getTotal();
        return next;
    }

    public void setNext(boolean next)
    {
        this.next = next;
    }

}
