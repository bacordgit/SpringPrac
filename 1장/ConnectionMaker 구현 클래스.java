package springbook.user.dao;
...
public class DconnectionMaker implements ConnectionMaker{
    ...
    public Connection makeConnection() throws ClassNotFoundedException, SQLException{
        // D사의 독자적인 방법으로 Connection을 생성하는 코드
    }
}