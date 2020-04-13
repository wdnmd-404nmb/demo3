package com.tx.zhcrm.mapper;

import com.tx.zhcrm.entity.Admin;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminMapper {

    Admin login(@Param("adminName") String adminName, @Param("password") String password);
}
