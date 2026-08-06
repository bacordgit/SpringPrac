import javax.sql.DataSource;

public class UserDao{
    private DataSource dataSource;
    public void setDataSource(DataSource dataSource){
        this.dataSource=dataSource;
    }
    public void add(User user) throws SQLException{
        Connection c=dataSource.getConnection();
    }
}