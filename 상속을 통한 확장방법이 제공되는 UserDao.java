public abstract class UserDao{
    public void add(User user) throws ClassNotException, SQLException{
        Connection c=getConnection();
        ...
    }
    public void get(String id) throws ClassNotException,SQLException{
        Connection c=getConnection();
        ...
    }
    public abstract Connection getConnection() throws ClassNotFoundException,SQLException;
}
public class NUserDao extends UserDao{
    public Connection getConnection() throws ClassNotFoundException,SQLException{
        //N사 생성 코드
    }
}
public class DUserDao extends UserDao{
    public Connection getConnection() throws ClassNotFoundException,SQLException{
        //D사 생성 코드
    }
}
/*템플릿 메소드 패턴
상속을 통해 슈퍼클래스의 기능을 확장할 때 사용하는 가장 대표적인 방법이다. 변하지 않은 기능은 슈퍼클래스에 만들어두고, 
자주 변경되거나 확장되는 기능은 서브 클래스에서 만들도록 한다. 
슈퍼클래스에서는 미이 추상 메소드 또는 오버라이드 가능한 메소드를 정의해두고 이를 활용하여 코드의 기본 알고리즘을 담고 있는 
템플릿 메소드를 만든다. 서브 클래스에서는 추상 메소드를 구현하거나 훅 메소드를 오버라이드하는 방법을 이용해 기능을 확장시킨다.

팩토리 메소드 패턴
상속을 통해 기능을 확장하는 패턴. 슈퍼클래스에서는 서브클래스에서 구현할 메소드를 호출하여 필요한 타입의 오브젝트를 가져와 사용한다.
이 메소드는 주로 인터페이스타입으로 오브젝트를 리턴하므로 서브 클래스에서는 정확히 어떤 클래스의 오브젝트를 만들어 리턴할지는 
슈퍼클래스도 알지 못한다.

자바는 클래스의 다중 상속을 허용하지 않는다. 
*/