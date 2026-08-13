public void add(final User user)throws SQLException{
    jdbcContextWithStatementStrategy(new StatementStrategy(){
        public PreparedStatement makePreparedStatement(Connection c) throws SQLException{
            PreparedStatement ps=c.prepareStatement("insert into users(id,name,password) values (?,?,?)");
            ps.setString(1,user.getId());
            ps.setString(2,user.getName());
            ps.setString(3,user.getPassword());
            return ps;
        }
    }
);
}