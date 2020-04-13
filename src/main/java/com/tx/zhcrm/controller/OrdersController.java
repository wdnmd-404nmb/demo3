package com.tx.zhcrm.controller;

import com.tx.zhcrm.entity.Orders;
import com.tx.zhcrm.mapper.OrdersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrdersController {

    @Autowired
    private OrdersMapper ordersMapper;

    @RequestMapping("/list2")
    public List<Orders> list() {
        return ordersMapper.selectAll();
    }
}
