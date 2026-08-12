public class UserDaoTest{
    public static void main(String[] args)throws SQLException{
        ApplicationContext context=new GenericXmlApplicationContext("applicationContext.xml");
        UserDao dao=context.getBean("userDao",UserDao.class);
        User user=new User;
        user.setId("user");
        user.setName("백기선");
        user.setpasssword("married");
        dao.add(user);
        System.out.println(user.getId()+"등록 성공");
        User user2=dao.get(user.getId());
        System.out.println(user2.getName());
        System.out.println(user2.getPassword());

        System.out.println(user2.getId()+"조회 성공");

    }
}