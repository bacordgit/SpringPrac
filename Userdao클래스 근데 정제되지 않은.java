package springbook.user.dao;

public class Userdao{
    public void add(User user)throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        Connection c=DriverManager.getConnection("jdbc:mysql://localhost/springbook");

        PreparedStatement ps=c.prepareStatement("insert into users(id,name,password) values(?,?,?)");
        ps.setString(1,user.getId());
        ps.setString(2,user.getName());
        ps.getString(3,user.getPassword());

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