public UserDao(){
AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DaoFactory.class);
this.connectionMaker=context.getBean("connectionMaker",ConnectionMaker.class);
}
