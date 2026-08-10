import org.junit.Before;
...
public class UserDaoTest{
    private UserDao dao;
    //setUp()메소드에서 만드는 오브젝트를 테스트 메소드에서 사용할 수 있도록 인스턴스 변수로 선언한다.

    @Before
    public void setUp(){
        ApplicationContext context=new GenericXmlApplicationContext("applicationContext.xml");
        this.dao=context.getBean("userDao",UserDao.class);
    }
    ...
    @Test
    public void addAndGet() throws SQLException{
        ...
    }
}