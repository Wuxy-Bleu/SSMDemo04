import cn.wuxy.bean.User;
import cn.wuxy.dao.IUserDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test {
    @org.junit.Test
    public void run01() throws IOException {
        //读取配置文件
        InputStream inputStream  = Resources.getResourceAsStream("mybatis-config-nouse.xml");
        //创建工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory=builder.build(inputStream);
        //使用工厂生产session对象
        SqlSession sqlSession = factory.openSession();
        //使用sqlsession创建dao接口的代理对象
        IUserDao userDao =sqlSession.getMapper(IUserDao.class);
        //使用代理对象执行方法
        List<User> users = userDao.findAll();

        for (User user :users)
            System.out.println(user);
        //关闭资源
        sqlSession.close();
        inputStream.close();
    }
}
