public class UserDao{
    private ConnectionMaker connectionMaker;
    //인터페이슬를 통해 오브젝트에 접근하므로 구체적인 클래스 정보를 알 필요가 없다.
    public UserDao{
        connectionMaker=new DConnectionMaker();
        //그런데 여기에서 클래스 이름이 나온다!
    }
    public void add(User user)throws ClassNotFoundedException,SQLException{
    Connection c=connectionMaker.makeConnection();
    //인터페이스에 정의된 메소드를 사용하므로 클래스가 바뀐다고 해도 메소드 이름이 변경될 걱정은 없다.
    ...
    }
    public User get(String id)throws ClassNotFoundedException,SQLException{
        Connection c=connectionMaker.makeConnection();
        ...
    }
    }
