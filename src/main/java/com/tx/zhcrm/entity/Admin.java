package com.tx.zhcrm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Admin {
    private int adminId;
    private String adminName;
    private String password;
    private String phone;
    private String createTime;
    private String updateTime;
    private int isDel;


}
