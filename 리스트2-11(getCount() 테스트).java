@Test
public void count() throws SQLException{
    ApplicationConext context=new AnnotationConfigApplicationContext("applicationContext.xml");
    userDao dao=context.getBean("userDao",Userdao.class);
    User user1=new User("gyumee","박성철","springno1");
    User user2=new User("leegw700","이길원","springno2");
    User user3=new User("bumjin","박범진","springno3");
    dao.deleteAll();
    assertThat(dao.getCount(),is(0));
    dao.add(user1);
    assertThat(dao.getCount(),is(1));
    dao.add(user2);
    assertThat(dao.getCount(),is(2));
    dao.add(user3);
    assertThat(dao.getCount(),is(3));
}