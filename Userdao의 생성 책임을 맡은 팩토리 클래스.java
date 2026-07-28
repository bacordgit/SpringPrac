package springbook.user.dao;
...
public class DaoFactory(){
public UserDao userdao(){
    ConnectionMaker connectionMaker=new DconnectionMaker;
    Userdao userdao=new Userdao(connectionMaker);
    return userdao;
}
}