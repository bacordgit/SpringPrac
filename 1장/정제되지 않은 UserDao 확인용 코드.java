public static void main(String args[]) throws ClassNotFoundException,SQLException{
    UserDao dao=new UserDao();
    User user=new User();
    user.setId("whiteship");
    user.setName("백기선");
    user.setPassword("married");
    dao.add(user);
    System.out.println(user.getId()+"등록 성공");

    User user2=dao.get(user.getId());
    //이미 get에서는 user에 대한 초기화를 하였기 때문에 바로 얻어온다.
    System.out.println(user2.getName());
    System.out.println(user2.getPassword());
    System.out.println(user2.getId());
}