package cn.wuxy.service;

import cn.wuxy.bean.User;

import java.util.List;

public interface IUserService {
    //查询所有的用户
    public List<User> findAll();
}
