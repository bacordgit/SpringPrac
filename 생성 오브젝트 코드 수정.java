public class DaoFactory{
    public UserDao userDao(){
     return new UserDao(connectionMaker());
    }
    public UserDao accountDao(){
        return new AccountDao(connectionMaker());
    }
    public UserDao messageDao(){
        return new MessageDao(connectionMaker());
    }
    public ConnectionMaker connectionMaker(){
        return new DConnectionMaker();
    }
}