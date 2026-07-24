package springbook.user.dao;

public class Userdao{
    public void add(User user)throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        //forName은 해당 이름의 클래스를 찾아 메모리에 로드하라는 명령어이다.
        Connection c=DriverManager.getConnection("jdbc:mysql://localhost/springbook");
        //저 주소로 연결 통로를 뚫어줘

        PreparedStatement ps=c.prepareStatement("insert into users(id,name,password) values(?,?,?)");
        //PreparedStatement는 자바 표준 라이브러리에 정의된 인터페이스(클래스)이름이다. 
        //prepareStatement는 Connection c 가 가지고 있는 기능(메서드)이름이다.
        ps.setString(1,user.getId());
        ps.setString(2,user.getName());
        ps.getString(3,user.getPassword());
        //이렇게 하는 이유: sql 인젝션을 막기위해서 속도 향상을 위해서

        ps.executeUpdate();
        ps.close();
        c.close();

    }
    public User get(String id) throws ClassNotFoundException,SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        Connection c=DriverManager.getConnection("jdbc:mysql://localhost/springbook","spring","book");
        PreparedStatement ps=c.prepareStatement("select * from users where id= ?");
        ps.setString(1,id);

        Result rs=ps.executeQuery();
        rs.next();
        //rs.next()를 하지 않으면 허공의 데이터만을 불러온다. 그러므로 포인터를 옮겨야한다.
        User user=new User();
        user.setId(rs.getString("id"));
        user.SetName(rs.getString("name"));
        user.SetPassword(rs.GetString("password"));
        rs.close();
        ps.close();
        c.close();
        return user;

    }
}