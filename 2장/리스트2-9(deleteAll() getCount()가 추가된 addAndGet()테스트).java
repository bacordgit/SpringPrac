@Test
public void addAndGet() throws SQLException{
    ...
    dao.deleteAll();
    assertThat(dao.getCount(),is(0));
    User user=new User();
    user.setId("gyumee");
    user.setName("박성철");
    user.setPassword("springno1");
    dao.add(user);
    assertThat(dao.getCount(),is(1));
    User user2= dao.get(user.getId());
    assertThat(user2.getName(),is(user.getName()));
    assertThat(user2.getPassword(),is(user.getPassword()));
}