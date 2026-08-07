package springbook.user.dao;
...
public interface ConnectionMaker{
    public Connection makeConnection()throws ClassNotFoundedException,SQLException;
}
