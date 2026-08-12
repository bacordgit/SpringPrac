public void add(final User user)throws SQLException{
    class AddStatement implements StatementStrategy{

        public PreparedStatement makePreparedStatement(Connection c) throws SQLException {
            PreparedStatement ps=c.prepareStatement("insert into users(id,name,password) values(?,?,?)");
            ps.setString(1,user.user,getId());
            ps.setString(2,user.user,getName());
            ps.setString(3,user.user,getPassword());
            //이러면 굳이 AddStatement클래스르르 정의를 안해줘도 된다.
           return ps; 
        }
    }
    StatementStrategy st=new AddStatement(user);
    jdbcContextWithStatementStrategy(st);
}