public int getcount() throws SQLException{
    Connection c=dataSource.getConnection();
    PreparedStatement ps=c.prepareStatement("select count(*) from users");
    ResultSet rs=ps.executeQuery();
    rs.next();
    int count=rs.getInt(1);
    rs.close();
    ps.close();
    c.close();
    return count;
}