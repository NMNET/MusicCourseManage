package com.nmnet.mapper;

import com.nmnet.pojo.User;

import java.util.List;

/**
 * Created by NMNET on 2017/3/1 0001.
 */
public interface IUserMapper {

    int addUser(User user);

    int deleteUserByName(String name);

    int updateUser(User user);

    User queryUserByName(String name);

    List<User> queryAllUsers();


}
