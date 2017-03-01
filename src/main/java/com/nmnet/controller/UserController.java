package com.nmnet.controller;

import com.nmnet.netbean.NetResponse;
import com.nmnet.pojo.User;
import com.nmnet.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by NMNET on 2017/3/1 0001.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/regist", method = RequestMethod.POST)
    @ResponseBody
    public NetResponse regist(User user) {
        return userService.regist(user);
    }

}
