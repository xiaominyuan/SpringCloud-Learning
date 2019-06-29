package com.yxm.cloud.service;

import com.yxm.entities.Dept;

import java.util.List;

public interface DeptService {
    void add(Dept dept);
    Dept get(Long id);
    List<Dept> list();
}
