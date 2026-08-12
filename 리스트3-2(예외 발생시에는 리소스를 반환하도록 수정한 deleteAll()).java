public void deleteAll() throws SQLException{
    Connection c=null;
    PreparedStatement ps=null;
    try{
        c=dataSource.getConnection();
        ps=c.prepareStatement("delete form users");
        ps.executeUpdate();
        //예외가 발생했을 때 부가적인 작업을 해줄 수 있도록 catch블록을 둔다. 아직은 예외를 다시 메소드 밖으로 던지는 것 밖에 없다.
    }catch(SQLExcpetion e){
        throw e;
    }finally{//finally이므로 try 블록에서 예외가 발생했을 때나 안 했을 때 모두 실행된다.
        if(ps!=null){
            try{
                ps.close();
            }catch(SQLException e){//ps.close()에서도 예외처리가 필요하다.

            }
    }
    if(c!=null){
        try{
            c.close();
        }catch(SQLException e){

        }
    }
}