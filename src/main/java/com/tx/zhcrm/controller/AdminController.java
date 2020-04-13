package com.tx.zhcrm.controller;


import com.google.gson.Gson;
import com.tx.zhcrm.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@RestController
public class AdminController {

    @Autowired
    private AdminMapper adminMapper;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    @ResponseBody
    public String login(@RequestParam(value = "adminName", required = false) String adminName,
                        @RequestParam(value = "password", required = false) String password) throws Exception {


        Logger.getGlobal().info(password);
        Logger.getGlobal().info("结果" + this.adminMapper.login(adminName, password));

        if (this.adminMapper.login(adminName, password) != null) {
            String msg = "登录成功";
            Gson gson = new Gson();
            return gson.toJson(msg);
        } else {
            String msg = "登录失败";
            Gson gson = new Gson();
            return gson.toJson(msg);
        }
    }


}
