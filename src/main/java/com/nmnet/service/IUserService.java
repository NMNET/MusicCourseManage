package com.nmnet.service;

import com.nmnet.netbean.NetResponse;
import com.nmnet.pojo.User;

/**
 * Created by NMNET on 2017/3/1 0001.
 */
public interface IUserService {

    NetResponse regist(User user);

}
