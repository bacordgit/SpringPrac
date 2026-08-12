import org.junit.Test;

public class UserDaoTest{
    @Test
    public void addAndGet() throws SQLException{
        ApplicationContext context=new AnnotationConfigApplicationContext("applicationContext.xml");
        UserDao dao=context.getBean("userDao",UserDao.class);
    }
}