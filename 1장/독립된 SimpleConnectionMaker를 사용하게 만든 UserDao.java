public class UserDao{
    private SimpleConnectionMaker simpleConnectionMaker;
public UserDao(){
simpleConnectionMaker=new SimpleConnectionMaker();
}
public void add(User user)throws classNotFoundException,SQLException{
    Connection c= simpleConnectionMaker.makeNewConnection();
    ...
}
public User get(String id)throws ClassNotFoundException,SQLException{
    Connection c=simpleConnectionMaker.makeNewConnection();
    ...
}
}