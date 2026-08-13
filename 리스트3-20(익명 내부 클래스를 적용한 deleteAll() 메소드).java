public void deleteAll() throws SQLException{
    jdbcContextWithStatementStrategy(new StatementStrategy(){
        public PreparedStatement makePreparedStatement(Connection c) throws SQLException{
            return c.prepareStatement("delete from users");
        }
    });
}