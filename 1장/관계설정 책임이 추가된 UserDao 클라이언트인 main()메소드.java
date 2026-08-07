public class UserDaoTest {
    public static void Main(String args[])throws ClassNotFoundedException, SQLException{
        ConnectionMaker connectionmaker=new DconnectionMaker();
        UserDao dao =new UserDao(connectionmaker);
        ...
        //1.UserDao 생성
        2. 사용할 ConnectionMaker타입의 오브젝트 제공
        결국 두 오브젝트 사이의 의존관계 설정 효과

    }
}
