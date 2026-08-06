package springbook.user.dao;
...
public class CountingConnectionMaker implements ConnectionMaker{
    int counter=0;
    private ConenctionMaker realConnectionMaker;
    public CountingConnectionMaker(ConnectionMaker realConnectionMaker){
        this.realConnectionMaker=realConnectionMaker;
    }
    public Connection makeconnection() throws ClassNotFoundException,SQLException{
        this.counter++;
        return this.realConnectionMaker.makeConnection();
    }
    public int getCounter(){
        return this.counter;
    }
}