public void deleteAll() throws SQLException{
    Connection c=dataSource.getConnection();


    PreparedStatement ps=c.prepareStatement("delete from users");
    ps.executeUpdate();
    //여기서 예외가 발생하면 바로 메소드 실행이 중단된다.

    ps.close();
    c.close();
}