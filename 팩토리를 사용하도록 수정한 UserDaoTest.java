public Class UserDaoTest {
    public static void main(String args[])throws ClassNotFoundException,SQLException{
     UserDao dao=new daoFactory().userdao();
    }
}
//DaoFactory로 분리했을 때 얻을 수 있는 장점은 매우 다양하다. 그 중에서도 어플리케이션의 컴포넌트 역할을 하는 오브젝트와 어플리케이션의 구조를 결정하는 오브젝트를 분리했다는데 가장 의미가 있다.

