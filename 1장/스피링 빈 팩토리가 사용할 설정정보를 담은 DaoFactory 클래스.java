import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
...
@Configuration//어플리케이션 컨텍스트 또는 빈 팩토리가 사용될 설정정보라는 표시
public class Daofactory{
@Bean//오브젝트 생성을 담당하는 IOC메소드라는 표시
public UserDao userDao(){
    return UserDao(connectionMaker());
}
@Bean
public ConnectionMaker connectionMaker(){
    return new DConnectionMaker();
}
}