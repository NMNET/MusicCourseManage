package com.nmnet.service.impl;

import com.nmnet.mapper.IUserMapper;
import com.nmnet.netbean.NetResponse;
import com.nmnet.pojo.User;
import com.nmnet.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by NMNET on 2017/3/1 0001.
 */

@Service
public class UserService implements IUserService {

    @Autowired
    private IUserMapper iUserMapper;
    @Autowired
    NetResponse netResponse;

    public NetResponse regist(User user) {
        try {
            iUserMapper.addUser(user);
            netResponse.setObject("regist success");
        } catch (Exception e) {
            netResponse.setFailObject("注册失败", e.getMessage());
        }
        return netResponse;
    }
}
