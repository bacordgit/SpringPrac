public void add(User user) throws SQLException{
    StatementStrategy st=new AddStatement(user);
    jdbcContextWithStatementStrategy(st);
}