package springbook.user.dao;
...
public class DeleteAllStatement implements StatementStrategy{
    public PreparedStatement makePreparedStatement(Connection c) throws SQLEXCeption{
        PreparedStatement ps=c.prepareStatement("delete from users");
        return ps;
    }
}