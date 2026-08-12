Connection c=null;
PreparedStatement ps=null;
try{
    c=dataSource.getConnection();

//여기까지가 변하지 않는 부분

ps=c.prepareStatement("delete from users"); //변하는  부분

//여기부터가 변하지 않는 부분
ps.executeUpdate();
}catch(SQLException e){
    throw e;
} finally{
    if(ps!=null){
        try{
            ps.close();
        }catch(SQLExcetion e){}
    }
    if(c!=null){
        try{
            c.close();
        }catch(SQLExcetion e){}
    }
}
//여기까지가 변하지 않는 부분