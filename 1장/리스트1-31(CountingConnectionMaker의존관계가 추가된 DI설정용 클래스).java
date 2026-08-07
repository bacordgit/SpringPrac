package springbook.user.dao;
...
@Configuration
public class CountingDaoFactory{
@Bean
public UserDao userDao(){
    return new UserDao(connectionMaker());
}
@Bean
public ConnectionMaker connectionMaker(){
    return new CountingConnectionMaker(realConnectionMaker()); //모든 DAO는 여전히 connectionMaker()에서 만들어지는 오브젝트를 DI받는다.

}
@Bean
public ConnectionMaker realConnectionMaker(){
    return new DConnectionMaker();
}
}