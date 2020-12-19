package com.primer.service;

import com.primer.common.persist.Params;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * @author 肖均辉
 */
public interface CommonService<T ,ID>{

    /**
     * 保存数据对象
     * @param entity 需要保持的实体类
     */
    void save(T entity);
    /**
     * 根据id查询
     * @param clazz 需要查询的类型
     * @param id 主键
     * @return 查询到的对象
     */
    T findByid(Class<T> clazz,ID id);
    /**
     * 根据表名，字段，参数查询，拼接sql语句
     * @param  clazz 表的class
     * @param filed 字段名
     * @param o 字段参数
     * @return 结果集
     */
    List<T> findByField(Class<T> clazz, String filed, Object o);

    /**
     * 多个字段的查询
     * @param clazz 表的class
     * @param map 将你的字段传入map中
     * @return 结果集
     */
    List<T> findByMoreFiled(Class<T> clazz,LinkedHashMap<String,Object> map);

    List<T> findAll(Class<T> clazz);

    /**
     * 根据表的id删除数据
     * @param  entity 需要删除的对象
     */
    boolean delete(T entity);
    /**
     * 更新对象
     * @param t 需要更新的对象
     * @param id 主键
     * @return 需要更新的对象
     */
    T update(T t ,ID id);
    /**
     * 根据条件查询总条数返回object类型
     * @param clazz 表的class
     * @param map 传入参数放入map中
     * @return 查询到的总数
     */
    Integer findCount(Class<T> clazz, LinkedHashMap<String,Object> map);

    /**
     * 通过传入自定义参数查询
     * @param clazz 对象类型
     * @param params 参数
     * @return 结果集
     */
    List<T> findByParams(Class<T> clazz , Params params);

    /**
     * 根据id删除
     * @param clazz 类型
     * @param id 主键
     * @return 结果标志
     */
    boolean deleteById(Class<T> clazz, ID id);

    /**
     * 通过id集合批量删除
     * @param clazz 类型
     * @param ids 主键集
     * @return 结果标志
     */
    boolean deleteByIds(Class<T> clazz , ID... ids);
}