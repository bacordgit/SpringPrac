public class AddStatement implements Statementstrategy{
    public PreparedStatement makePreparedStatement(Connection c)throws SQLException{
        PreparedStatement ps=c.preparedStatement("insert into users(id,name,password) values(?,?,?)");
        ps.setString(1,user.getId());
        ps.setString(2,user.getName());
        ps.setString(3,user.getPassword());
        //그럼 user는 어디서 가져올까?

    }
}