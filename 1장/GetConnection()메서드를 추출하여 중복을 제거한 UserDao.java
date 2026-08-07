//중복 코드의 메소드 추출
public void add(User user) throws ClassNotFoundException, SQLException{
    Connection c=getConnection();
    ...
}

public User get(String id) throws ClassNotFoundException, SQLExcpetion{
    Connection c=getConnection();
    ...
}

private Connection getConnection() throws ClassNotFoundException,SQLException{
    Class.forName("com.mysql.jdbc.Driver");
    Connection c=DriverManager.getConnection("jdbc:mysql://localhost/springbook","spring","book");
    return c;
}
/*리팩토링
기존의 코드를 외부의 동작 방식에는 변화없이 내부 구조를 변경하여 재구성하는 작업 유지보수가 용이해진다. */