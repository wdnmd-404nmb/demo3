package com.tx.zhcrm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    private int customerId;
    private String customerName;
    private String sex;
    private String address;
    private String telephone;
    private String createTime;
    private String updateTime;
    private int isDel;
}
