package com.yxm.cloud.service.impl;


import com.yxm.cloud.dao.DeptDao;
import com.yxm.cloud.service.DeptService;
import com.yxm.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DeptServiceImpl implements DeptService {


    @Autowired
    private DeptDao deptDao;

    public void add(Dept dept) {
        deptDao.addDept(dept);
    }

    public Dept get(Long id) {
        return deptDao.findById(id);
    }

    public List<Dept> list() {
        return deptDao.findAll();
    }
}
