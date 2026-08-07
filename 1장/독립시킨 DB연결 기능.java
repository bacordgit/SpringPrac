package springbook.user.dao;
...
public class SimpleConnectionMaker{
    public Connection makeNewConnection() throws ClassNotFoundException, SQLException{
        Class.forname("com.mysql.jdbc.Driver");
        Connection c=DriverManager.getConnection("jdbc:mysql://localhost/springbook","spring","book");
        return c;
    }
}
/*클래스를 분리한 경우에는 상속을 이용할 때와 마찬가지로 자유로운 확장을 가능하게 하려면 두가지 문제를 해결해야 한다.
1. SimpleConnectionMaker의 메소드가 문제이다.
makeNewConnection을 이용하여 DB커넥션을 가져오게 했는데, 만약 D사에서 만든 DB커넥션 제공 클래스는 openConnection()
이라는 메소드 이름을 사용했다면 UserDao 내에 있는 add(),get()메소드의 커넥션을 가져오는 코드를 모두 변경해야 한다.
2. DB커넥션을 제공하는 클래스가 어떤 것인지를 UserDao가 구체적으로 알고 있어야 한다.UserDao에 simpleConnectionMaker라는 클래스
타입의 인스턴스 변수까지 정의해놓고 있으니 N사에서 다른 클래스를 구현하면 어쩔 수 없이 UserDao자체를 수정해야 한다. */