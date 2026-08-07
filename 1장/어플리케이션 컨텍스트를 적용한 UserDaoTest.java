public class UserDao{
    public static void Main(String args[]) throws ClassNotFoundException,SQLException{
        ApplicationContext context=new AnnotationConfigApplicationContext(DaoFactory.class);
        UserDao dao=context.getBean("userDao",UserDao.class);
    }
}