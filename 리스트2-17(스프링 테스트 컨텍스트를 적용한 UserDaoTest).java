@RunWith(SpringJUnit4ClassRunner.class)//스프링의 테스트 컨텍스트 프레임워크의 JUNIT 확장기능 지정
@ContextConfiguration(locations="/applicationContexxt.xml")//테스트 컨텍스트가 자동으로 만들어줄 애플리케이션 컨텍스트의 위치지정
public class UserDaTest{
    @Autowired
    private ApplicationContext context;//테스트 오브젝트가 만들어지고 나면 스프링 컨텍스트에 의해 자동으로 값이 주입된다.
...
    @Before
    public void setup(){
        this.dao=this.context.getBean("userDao",UserDao.class);
        ...

    }
}