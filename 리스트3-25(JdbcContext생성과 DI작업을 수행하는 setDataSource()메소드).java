Public class UserDao{
    ...
    private JdbcContext jdbcContext;
    public setDataSource(DataSource dataSource){
        this.jdbcContext=new JdbcContext();
        this.jdbcContext.setDataSource(dataSource);
        this.dataSource=dataSource;

    }
}