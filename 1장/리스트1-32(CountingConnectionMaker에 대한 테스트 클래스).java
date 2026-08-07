package springbook.user.dao;
...
public class UserDaoConnectionCountingTest{
    public static void main(String[] args) throws ClassNotFounException, SQLException{
        AnnotationConfigApplictionContext context=new AnnotationConfigapplicationContext(CountingDaofactory.class);
        Userdao dao=context.getBean("userDao",Userdao.class);
        //
        //Dao 사용코드
        //
        CountingConnectionMaker ccm=context.getBean("connectionMaker",CountingConnectionMaker.class);
        System.out.println("Connection counter: " + ccm.gerCounter());
    }
}