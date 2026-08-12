public class UserDaoTest{
    UserDao dao;
    ...
    @Before
    public void setUp(){
        ...
        dao=new Userdao();
        DataSource dataSource=new SingleConnectionDataSource("jdbc:mysql://localhost/testdb","spring","book",true);
        dao.setDataSource(datasource);
    }
}