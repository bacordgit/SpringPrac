public class UserDao{
    private ConnectionMaker connectionMaker;// 초기에 설정하면 사용중에는 바뀌지 않는 읽기 전용 인스턴스 변수
    private Connection c;
    private User user;
    public User get(String id)throws ClassNotEoundException,SQLException{
        this.c=connectionMaker.makeConnection();
        ...
        this.user=new User();
        this.user.setId(rs.getString("id"));
        this.user.setName(rs.getString("name"));
        this.user.setPassword(rs.getString("password"));
        ...
        return this.user;
    }
}