package com.webreporter.dao.impl;

import com.webreporter.dao.IBaseDAO;
import java.io.Serializable;
import java.util.List;
import javax.annotation.Resource;
import javax.persistence.criteria.CriteriaQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @param <T>
 * @author Chhotelal
 */
public abstract class BaseDAO<T extends Serializable> implements IBaseDAO<T> {

    @Resource
    private SessionFactory sessionFactory;

    public BaseDAO() {
    }

    @Override
    public void create(T t) {
        getSession().save(t);
    }

    @Override
    public void update(T t) {
        getSession().update(t);
    }

    @Override
    public List<T> listAll(Class<T> t) {
        CriteriaQuery<T> criteria = getSession().getCriteriaBuilder().createQuery(t);
        return getSession().createQuery(criteria).getResultList();
    }

    @Override
    public void delete(T t) {
        getSession().delete(t);
    }

    @Override
    public T findById(Class<T> t, long tid) {
        return getSession().get(t, tid);
    }

    public Session getSession() {
        return sessionFactory.getCurrentSession();
    }
}
