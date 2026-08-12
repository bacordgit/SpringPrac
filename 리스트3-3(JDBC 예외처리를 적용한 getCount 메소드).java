public int getCount() throws SQLException{
    Connection c=null;
    PreparedStatement ps=null;
    ResultSet rs=null;

    try{
        c=dataSource.getConnection();
        ps=c.preparedStatement("select count(*) from users");

        rs=ps.executeQuery();
        rs.next();
        return rs.getInt(1);

    } catch(SQLException e){
        throw e;
    } finally{
        if(rs!=null){
            try{
                rs.close();
            }catch(SQLException e){

            }
        }
        if(ps!=null){
            try{
                ps.close();
            } catch(SQLException e){

            }
        }
        if(c!=null){
            try{
                c.close();
            }catch(SQLException e){
                
            }
        }
    }
}