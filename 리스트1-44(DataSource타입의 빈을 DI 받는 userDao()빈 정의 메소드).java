@Bean
public UserDao userDao(){
    UserDao userDao = new UserDao();
    userDao.setDataSource(dataSource());
    return userDao;
}