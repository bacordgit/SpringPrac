Public class UserDao{
    ...
    private JdbcContext jdbcContext;
    public setJdbcContext(JdbcContext jdbcContext){
        this.jdbcContext=jdbcContext;
    }
    public void add(final User user)throws SQLException{
        this.jdbcContext.workWithStatementStrategy(
            new StatementStrategy(){...}
        );
    }
    public void deleteAll()throws SQLException{
        this.jdbcContext.workWithStatementStrategy(
            new StatementStrategy(){...}
        );
    }
}