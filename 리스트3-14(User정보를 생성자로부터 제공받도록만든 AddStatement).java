package springbook.user.dao;
...
public class AddStatement implements Statementstrategy{
    User user;
    public Addstatement(User user){
        this.user=user;
    }
    public PreparedStatement makePreparedStatement(Connection c){
        PreparedStatement ps=c.preparedStatement("insert into users(id,name,password) values(?,?,?)");
        ps.setString(1,user.getId());
        ps.setString(2,user.getName());
        ps.setString(3,user.getPassword());

    }
}