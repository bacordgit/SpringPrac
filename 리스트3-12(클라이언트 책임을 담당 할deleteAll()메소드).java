public void deleteAll() throws SQLException{
    StatementStrategy st=new DeleteAllStatement()
    jdbcContextWithStatementStrategy(st);
}