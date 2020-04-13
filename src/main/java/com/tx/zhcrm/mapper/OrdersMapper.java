package com.tx.zhcrm.mapper;

import com.tx.zhcrm.entity.Orders;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdersMapper {

    List<Orders> selectAll();
}
