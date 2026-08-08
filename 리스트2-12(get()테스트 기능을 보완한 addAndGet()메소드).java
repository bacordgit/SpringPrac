@Test
public void addAndGet() throw SQLException{

    UserDao dao=context.getBean("userDao",UserDao.class);
    User user1=new User("gyumee","박성철","springno1");
    User user2=new User("leegw700","이길원","springno2");
    dao.deleteAll();
    assertThat(dao.getcount(),is(0));
    dao.add(user1);
    dao.add(user2);
    assertThat(dao.getcount(),is(2));

    User userget1=dao.get(user1.getId());
    assertThat(userget1.getName(),is(user1.getName()));
    assertThat(userget1.getPassword(),is(user1.getPassword()));

    User userget2=dao.get(user2.getID());
    assertThat(userget2.getName(),is(user2.getName()));
    assertThat(userget2.getPassword(),is(user2.getPassword()));
}