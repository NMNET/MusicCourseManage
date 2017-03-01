import com.nmnet.mapper.IUserMapper;
import com.nmnet.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by NMNET on 2017/3/1 0001.
 */
public class MybatisTest {
    @Test
    public void test() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        System.err.println(ac);
        IUserMapper userMapper = ac.getBean(IUserMapper.class);
        User user = new User();
        user.setName("xiaoxiao1");
        user.setAge(18);
        user.setPwd("qwer");
        user.setAlia("tiny");
        userMapper.updateUser(user);
//        List<User> users = userMapper.queryAllUsers();
//        for (User user : users) {
//            System.err.println(user);
//        }
    }

}
