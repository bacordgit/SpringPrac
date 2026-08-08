import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.aeertThat;

public class UserDaoTest{
    @Test
    public void addAndGet() throws SQLException{
        ApplicationContext context=new GenericXmlApplicationContext("applicationContext.xml");
        UserDao dao=context.getBean("userDao",UserDao.class);
        User user=new User;
        user.setId("gyumee");
        user.setName("박성철");
        user.setPassword("springno1");
        dao.add(user);
        User user2=dao.get(user.getId())l
        assertThat(user2.getName(),is(user.getName()));
        assertThat(user2.getPassword(),is(user.getPassword()));
    }
}