public void jdbcContextWithStatementStrategy(StatementStrategy stmt) throws SQLException{
    Connection c=null;
    PreparedStatement ps=null;
    try{
        c=dataSource.getConnection();
        ps=c.stmt.makePreparedStatement(c);
        ps.executeUpdate();

    }catch(SQLException e){
        throw e;
    } finally{
        if(ps!=null){try{ps.close();}catch(SQLException e){}}
        if(c!=null){try{c.close();}catch(SQLException e){}}
    }
}