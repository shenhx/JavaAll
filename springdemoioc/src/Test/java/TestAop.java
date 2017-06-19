import junit.framework.TestCase;
import org.junit.Ignore;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/6/19 0019.
 */

public class TestAop {
    @org.junit.Test
    public void testAop() throws Exception {
        ApplicationContext ctx=
                new ClassPathXmlApplicationContext("login.bean.xml");
        IUser user=(IUser)ctx.getBean("user");
        user.Login("username", "123456");
    }

}