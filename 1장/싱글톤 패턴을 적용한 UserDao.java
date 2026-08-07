public class UserDao{
    private static UserDao INSTANCE;
    private UserDao(ConnectionMaker connectionMaker){
        this.connectionMaker=connectionMaker;
    }
    public static synchronized UserDao getInstance(){
        if(INSTANCE==NULL) INSTANCE=new UserDao(???);
        return INSTANCE;
    }
    ...
}