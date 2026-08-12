public void add(User user)throws SQLException{
    class AddStatement implements StatementStrategy{
        User user;
        public AddStatement(User user){
            this.user=user;
        }
        public PreparedStatement makePreparedStatement(Connection c) throws SQLException {
            PreparedStatement ps=c.prepareStatement("insert into users(id,name,password) values(?,?,?)");
            ps.setString(1,user.user,getId());
            ps.setString(2,user.user,getName());
            ps.setString(3,user.user,getPassword());
            
           return ps; 
        }
    }
    StatementStrategy st=new AddStatement(user);
    jdbcContextWithStatementStrategy(st);
}