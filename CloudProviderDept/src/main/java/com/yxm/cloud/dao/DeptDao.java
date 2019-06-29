package com.yxm.cloud.dao;

import com.yxm.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptDao {
    public void addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();

}
