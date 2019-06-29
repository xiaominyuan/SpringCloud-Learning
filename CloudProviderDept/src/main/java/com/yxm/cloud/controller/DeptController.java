package com.yxm.cloud.controller;



import com.yxm.cloud.service.DeptService;
import com.yxm.entities.Dept;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    public void add(@RequestBody Dept dept){
        deptService.add(dept);
    }

    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id){
        return deptService.get(id);
    }

    @RequestMapping(value = "/dept/list",method = RequestMethod.GET)
    public List<Dept> list(){
        return deptService.list();
    }


    @RequestMapping(value = "/dept/discovery",method = RequestMethod.GET)
    public Object discovery(){
        List<String> list = discoveryClient.getServices();
        System.out.println(list);

        List<ServiceInstance> serviceList = discoveryClient.getInstances("yuanxiaomin");
        for (ServiceInstance serviceInstance : serviceList){
            System.out.println(serviceInstance.getServiceId());
            System.out.println(serviceInstance.getHost());
            System.out.println(serviceInstance.getPort());
            System.out.println(serviceInstance.getUri());
        }

        return discoveryClient;

    }


}
