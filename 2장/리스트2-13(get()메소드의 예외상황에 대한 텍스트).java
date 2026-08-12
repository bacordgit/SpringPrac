@Test(expected=EmptyResultDataAccessException.class)
public void getUserFailure() throws SQLException{
    ApplicationContext context=new GenericXmlApplicationContext("applicationContext.xml");
    UserDao dao=context.getBean("userDao",UserDao.class);
    dao.deleteAll();
    assertThat(dao.getCount(),is(0));
    dao.get("unknown_id");
}