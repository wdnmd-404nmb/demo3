package com.tx.zhcrm.mapper;

import com.tx.zhcrm.entity.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerMapper {

    List<Customer> selectAll();

    int add(Customer customer);

    int up(Customer customer);

    int del(Integer id);

}
