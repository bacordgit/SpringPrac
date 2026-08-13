<?xml version=1.0 encoding="UTF-8"?>
<beans xmlns="http://www.springfrmaework.org/schema/beans"
xmlns:xsi="https://w3.org/2001/XMLSchema-instance"
xsi:schemaLoaction="http://www.springframework.org/schema/beans"
http://www.springframework.org/schema/beans/spring-beans.xsd">

<bean id="userDao" class="springbook.user.dao.UserDao">
    <property name="dataSource" ref="dataSource" />//UserDao내에 아직 jdbcContext를 적용하지 않은 메소드가 있어서 필요하다.

    <property name="jdbcContext" ref="jdbcContext" />
</bean>

<bean id="jdbcContext" class="springbook.user.dao.JdbcContext">
    <property name="dataSource" ref="dataSource" />
</bean>

<bean id="dataSource"
    class="org.springframework.jdbc.datasource.SimpleDriverdataSource">
    ...
</bean>
</beans>
