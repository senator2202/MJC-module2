package com.epam.esm.model.dao;

import com.epam.esm.model.entity.GiftEntity;

import java.util.List;

public interface BaseDao<T extends GiftEntity> {

    T findById(long id);

    List<T> findAll();

    T add(T entity);

    T update(T entity);

    void delete(long id);
}