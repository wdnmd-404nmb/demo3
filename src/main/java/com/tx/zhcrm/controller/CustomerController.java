package com.tx.zhcrm.controller;

import com.tx.zhcrm.entity.Customer;
import com.tx.zhcrm.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerMapper customerMapper;

    @RequestMapping("/list")
    public List<Customer> selectAll() {

        return customerMapper.selectAll();
    }

    @RequestMapping("/add")
    public Integer add(Customer customer) {
        return customerMapper.add(customer);
    }

    @RequestMapping("/up")
    public Integer up(Customer customer) {
        return customerMapper.up(customer);
    }

    @RequestMapping("/del")
    public Integer del(Integer id) {
        return customerMapper.del(id);
    }

}
