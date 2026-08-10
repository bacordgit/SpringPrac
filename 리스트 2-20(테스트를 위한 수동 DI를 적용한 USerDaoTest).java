...
@DirtiedContext//테스트 메소드에서 어플리케이션컨텍스트의 구성이나 상태를 변경한다는 것을 테스트 컨텍스트 프레임워크에 알려준다.
public class UserDaoTest{
    @Autowird
    UserDao dao;

    @Before
    public void setup(){
        ...
        DataSource datasource=new SingleConnectiondataSource("jdbc:mysql://localhost/testdb","spring","book",true);
        //테스트에서 UserDao가 사용할 DataSource오브젝트를 직접 생성한다.
        dao.setDataSource(datasource);//코드에 의한 수동 DI
    }
}