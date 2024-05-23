package com.coders.hospital.db.dao;

/**
 *
 * @author Codersbay
 * @param <T>
 */
import java.util.List;

public interface DaoList<T> {

    public List<T> loadAll() throws Exception;

    public String insert()throws Exception;

    public String update()throws Exception;

    public String delete()throws Exception;

    public T getData(T t)throws Exception;



}
