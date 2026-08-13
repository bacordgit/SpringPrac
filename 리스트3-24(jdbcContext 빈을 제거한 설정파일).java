<?xml version=1.0 encoding="UTF-8"?>
<beans xmlns="http://www.springfrmaework.org/schema/beans"
xmlns:xsi="https://w3.org/2001/XMLSchema-instance"
xsi:schemaLoaction="http://www.springframework.org/schema/beans"
http://www.springframework.org/schema/beans/spring-beans.xsd">

<bean id="userDao" class="springbook.user.dao.UserDao">
    <property name="dataSource" ref="dataSource" />
</bean>

<bean id="dataSource"
    class="org.springframework.jdbc.datasource.SimpleDriverdataSource">
    ...
</bean>
</beans>
