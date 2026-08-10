public class UserDaoTest{
private UserDao dao;
private User user1;
private User user2;
private User user3;

@Before
public void setup(){
    ...
    this.user1=new User("gyumee","막성철","springno1");
    this.user2=new User("gyumee1","막성철1","springno11");
    this.user3=new User("gyumee2","막성철2","springno12");
}
...
}
