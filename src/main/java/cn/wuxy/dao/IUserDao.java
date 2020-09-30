package cn.wuxy.dao;

import cn.wuxy.bean.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUserDao {

    @Select("select * from user")
    public List<User> findAll();
}
