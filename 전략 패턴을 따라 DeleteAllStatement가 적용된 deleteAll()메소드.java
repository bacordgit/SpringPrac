public void deleteAll() throws SQLException{
    ...
    try{
        c=dataSource.getConnection();
    }
    StatementStrategy strategy=new DeleteAllStatement();
    ps=strategy.makePreparedstatement(c);
    ps.executeUpdate();
}catch(SQLException e){
    ...
}