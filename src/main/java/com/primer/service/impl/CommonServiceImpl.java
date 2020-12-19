package com.primer.service.impl;

import com.primer.common.persist.Params;
import com.primer.common.util.BeanUtils;
import com.primer.service.CommonService;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 肖均辉
 */
@Repository
public class CommonServiceImpl<T, ID> implements CommonService<T, ID> {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    @Transactional(rollbackOn = Exception.class)
    public void save(T entity) {
        try {
            entityManager.persist(entity);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public T findByid(Class<T> clazz, ID id) {
        try {
            return entityManager.find(clazz, id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public List<T> findByField(Class<T> clazz, String filed, Object value) {
        try {
            String sql = "from " + clazz.getName() + " u WHERE u." + filed + "=?1";
            Query query = entityManager.createQuery(sql);
            query.setParameter(1, value);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        } finally {
            entityManager.close();
        }
    }

    @Override
    @Transactional(rollbackOn = Exception.class)
    public boolean deleteById(Class<T> clazz, ID id) {
        try {
            String sql = "delete from " + clazz.getName() + " u WHERE u.id = ?1";
            Query query = entityManager.createQuery(sql);
            query.setParameter(1, id);
            int i = query.executeUpdate();
            return i > 0;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        } finally {
            entityManager.close();
        }
    }

    @Override
    @Transactional(rollbackOn = Exception.class)
    public boolean deleteByIds(Class<T> clazz, ID... ids) {
        try {
            StringBuilder sql = new StringBuilder("delete from " + clazz.getName() + " u WHERE u.id in (");
            for (int i = 0; i < ids.length; i++) {
                sql.append("?").append(i + 1).append(",");
            }
            sql.deleteCharAt(sql.length() - 1);
            sql.append(")");
            Query query = entityManager.createQuery(sql.toString());
            for (int i = 0; i < ids.length; i++) {
                query.setParameter(i + 1, ids[i]);
            }
            return query.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        }finally {
            entityManager.close();
        }
    }

    @Override
    public List<T> findByMoreFiled(Class<T> clazz, LinkedHashMap<String, Object> map) {
        try {
            StringBuilder sql = new StringBuilder("from " + clazz.getName() + " u WHERE ");
            ArrayList<String> fields = new ArrayList<>(map.keySet());
            for (int i = 0; i < fields.size(); i++) {
                sql.append("u.").append(fields.get(i)).append("=?").append(i+1).append(" and ");
            }
            sql = new StringBuilder(sql.substring(0, sql.length() - 4));
            Query query = entityManager.createQuery(sql.toString());
            for (int i = 0; i < fields.size(); i++) {
                query.setParameter(i + 1, map.get(fields.get(i)));
            }
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        } finally {
            entityManager.close();
        }
    }

    @Override
    public List<T> findAll(Class<T> clazz) {
        try {
            return entityManager.createQuery("from " + clazz.getName() + " u ").getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        } finally {
            entityManager.close();
        }
    }

    @Override
    @Transactional(rollbackOn = Exception.class)
    public T update(T entity, ID id) {
        try {
            T o = (T) entityManager.find(entity.getClass(), id);
            BeanUtils.copyPropertiesExcludeNull(entity, o);
            return entityManager.merge(o);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    @Transactional(rollbackOn = Exception.class)
    public boolean delete(T entity) {  //entity通过设置id来删除相应数据
        try {
            entityManager.remove(entityManager.merge(entity));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public Integer findCount(Class<T> clazz, LinkedHashMap<String, Object> map) {
        try {
            StringBuilder sql = new StringBuilder("select count(u) from " + clazz.getName() + " u WHERE ");
            List<String> fields = new ArrayList<>(map.keySet());
            for (int i = 0; i < fields.size(); i++) {
                sql.append("u.").append(fields.get(i)).append("=?").append(i + 1).append(" and ");
            }
            sql = new StringBuilder(sql.substring(0, sql.length() - 4));
            Query query = entityManager.createQuery(sql.toString());
            for (int i = 0; i < fields.size(); i++) {
                query.setParameter(i + 1, map.get(fields.get(i)));
            }
            return Integer.parseInt(query.getSingleResult().toString());
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public List<T> findByParams(Class<T> clazz, Params params) {
        //jpa运行时需要的参数
        List<Object> param = new ArrayList<>();
        try {
            StringBuilder sql = new StringBuilder();
            sql.append("from ").append(clazz.getName()).append(" u WHERE 1=1 ");
            int index = 0;
            //拼接sql，添加参数集合
            index = concatSqlForObj(index, param, sql, params.getAnd(), params.getAndPara());
            index = concatSqlForObj(index, param, sql, params.getOr(), params.getOrPara());
            index = concatSqlForList(index, param, sql, params.getBetween(), params.getBetweenPara());
            index = concatSqlForObj(index, param, sql, params.getLessThan(), params.getLessThanPara());
            index = concatSqlForObj(index, param, sql, params.getMoreThan(), params.getMoreThanPara());
            index = concatSqlForObj(index, param, sql, params.getLike(), params.getLikePara());
            index = concatSqlForObj(index, param, sql, params.getNotLike(), params.getNotLikePara());
            index = concatSqlForObj(index, param, sql, params.getOrderBy(), params.getOrderByPara());
            index = concatSqlForObj(index, param, sql, params.getNot(), params.getNotPara());

            index = concatSqlForList(index, param, sql, params.getIn(), params.getInPara());
            concatSqlForList(index, param, sql, params.getNotIn(), params.getNotInPara());

            Query query = entityManager.createQuery(sql.toString());
            //limit
            if (params.getLimitPara() != null) {
                List<?> list = params.getLimitPara().get("limit");
                query.setFirstResult((Integer) list.get(0));
                query.setMaxResults((Integer) list.get(1));
            }
            for (int i = 0; i < param.size(); i++) {
                query.setParameter(i + 1, param.get(i));
            }
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        }finally {
            entityManager.close();
        }
    }

    public static int concatSqlForObj(int index, List<Object> param, StringBuilder sql, List<String> symbols, LinkedHashMap<String, Object> params) {
        //拼接sql时需要的参数索引
        int index1 = index;
        //取list中的键值对是需要的索引
        int x = 0;
        if (symbols != null && symbols.size() != 0) {
            for (String symbol : symbols) {
                //通过转换list获取键值对
                List<Map.Entry<String, Object>> indexedList = new ArrayList<Map.Entry<String, Object>>(params.entrySet());
                Map.Entry<String, Object> entry = indexedList.get(x);
                String key = entry.getKey();
                Object value = entry.getValue();
                index1++;
                x++;
                if ("or".equals(symbol)) {
                    sql.append(" or u.").append(key).append("=?").append(index1);
                } else if ("<".equals(symbol)) {
                    sql.append(" and u.").append(key).append("<?").append(index1);
                } else if (">".equals(symbol)) {
                    sql.append(" and u.").append(key).append(">?").append(index1);
                } else if ("like".equals(symbol)) {
                    sql.append(" and u.").append(key).append(" like ?").append(index1);
                } else if ("notlike".equals(symbol)) {
                    sql.append(" and u.").append(key).append(" not like ?").append(index1);
                } else if ("!=".equals(symbol)) {
                    sql.append(" and u.").append(key).append(" != ?").append(index1);
                } else if ("orderby".equals(symbol)) {
                    //val的值可取asc 和 desc
                    sql.append(" ORDER BY ").append(key).append(" ").append(value.toString());
                    return index1;
                } else {
                    sql.append(" and u.").append(key).append(symbol).append("?").append(index1);
                }
                param.add(value);
            }
        }
        return index1;
    }

    public static int concatSqlForList(int index, List<Object> param, StringBuilder sql, List<String> symbols, LinkedHashMap<String, List> params) {
        //拼接sql时需要的参数索引
        int index1 = index;
        //取list中的键值对是需要的索引
        int x = 0;
        if (symbols != null && symbols.size() != 0) {
            for (String symbol : symbols) {
                //通过转换list获取键值对
                List<Map.Entry<String, List>> indexedList = new ArrayList<Map.Entry<String, List>>(params.entrySet());
                Map.Entry<String, List> entry = indexedList.get(x);
                String key = entry.getKey();
                List value = entry.getValue();

                index1++;
                x++;

                if ("between".equals(symbol)) {
                    sql.append(" and u.").append(key).append(" between ?").append(index1).append(" and ?").append(index1 + 1);
                    index1++;
                } else if ("in".equals(symbol) || "notin".equals(symbol)) {
                    sql.append(" and u.").append(key);
                    if ("in".equals(symbol)) {
                        sql.append(" in (?");
                    } else {
                        sql.append(" not in (?");
                    }
                    sql.append(index1);
                    param.add(value.get(0));
                    for (int i = 1; i < value.size(); i++) {
                        index1++;
                        sql.append(",?").append(index1);
                        param.add(value.get(i));
                    }
                    sql.append(")");
                    return index1;
                }
                param.add(value.get(0));
                param.add(value.get(1));
            }
        }
        return index1;
    }
}