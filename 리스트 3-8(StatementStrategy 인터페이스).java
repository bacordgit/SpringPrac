package springbook.user.dao;
...
public interface StatementStrategy{
    PreparedStatement makePreparedStatement(Connection c) throws SQLException;
}