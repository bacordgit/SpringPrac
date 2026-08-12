public User get(String id)throws SQLException{
    ...
    ResultSet rs=ps.executeQuery();
    User user=null;
    if(rs.next()){
        user=new User;
        user.setID(rs.getString("id"));
        user.setName(rs.getString("name"))
        user.setPassword(rs.getString("password"));
    }
    rs.close();
    ps.close();
    c.close();
    if(user==null) throw new EmptyResultDataAccessException(1);
    return user;
}