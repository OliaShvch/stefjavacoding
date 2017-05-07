package com.stef.MagazineProject.dao;

import java.io.Serializable;
import java.util.ArrayList;

public interface GenericDao<T, PK extends Serializable> {
    public T create() throws DaoException;
    public T create(T object) throws DaoException;
    public T read(PK key)throws DaoException;
    public void update(T obj)throws DaoException;
    public void delete(T obj)throws DaoException;
    public ArrayList<T> readAll()throws DaoException;

}
