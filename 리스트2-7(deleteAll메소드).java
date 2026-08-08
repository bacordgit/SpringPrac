public void deleteAll() throws SQLException{
    Connection c=dataSource.getConnection();
    PreparedStatement ps=c.prepareStatement("delete from users");
    ps.executeUpdate();
    ps.close();
    c.close();
}