package com.webreporter.dao;

import java.util.List;

/**
 *
 * @author Chhotelal
 * @param <T>
 */
public interface IBaseDAO<T> {

    void create(T t);

    void update(T t);

    List<T> listAll(Class<T> t);

    void delete(T t);

    T findById(Class<T> t, long tid);
}
