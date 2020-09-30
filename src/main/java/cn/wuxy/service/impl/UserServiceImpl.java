package cn.wuxy.service.impl;

import cn.wuxy.bean.User;
import cn.wuxy.dao.IUserDao;
import cn.wuxy.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public List<User> findAll() {
        System.out.println("业务层 查询用户");
        return userDao.findAll();
    }
}
