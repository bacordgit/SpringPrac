@Bean
public DataSource dataSource(){
    SimpleDriverDataSource dataSource=new SimpleDriverDataSource();
    dataSource.setDriverClass(com.mysql.jdbc.Driver.class);
    dataSource.setUrl("jdbc:mysql://localhost/springbook");
    dataSource.setUsername("spring");
    dataSource.setPassword("book"); 
    return dataSource;
}