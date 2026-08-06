package javax.sql;
public interface DataSource extends CommonDataSource,Wrapper{
    Connection getConnection() throws SQLException;
}