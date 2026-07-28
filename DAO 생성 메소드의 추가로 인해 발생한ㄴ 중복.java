public class DaoFactory{
    public UserDao userDao(){
     return new UserDao(new DconnectionMaker());
    }
    public UserDao accountDao(){
        return new AccountDao(new DconnectionMaker());
    }
    public UserDao messageDao(){
        return new MessageDao(new DconnectionMaker());
    }
}
//ConnectionMaker 구현 클래스를 선정하고 생성하는 코드의 중복