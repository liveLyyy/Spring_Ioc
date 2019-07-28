IoC
===
1、控制反转<br>
2、IoC是什么：<br>
>>2.1、IoC完成的事情原先由程序员通过new实例化对象的事情转交给Spring管理<br>
>>2.2、控制反转中控制指的是：控制类对象<br>
>>2.3、控制反转中的反转指的是转交给Spring管理<br>
>>2.4、IoC最大的作用是‘解耦’：程序员不需要管理对象，解除了对象管理和程序员之间的耦合<br>

3、Spring环境搭配：spring配置文件是基于schema<br>
>>3.1、schema文件扩展名.xsd<br>
>>3.2、schema可以理解成DTD的升级版,DTD具备更好的扩展性<br>
>>3.3、xsd文件可以看做namespace(xmlns)<br>

4、Spring创建对象的三种方式<br>
>>4.1、通过构造方法创建<br>
>>>4.1.1、无参构造创建：默认情况<br>
>>>4.1.2、有参构造创建：需要明确的配置<br>
>>>>>4.1.2.1、需要类中提供构造方法<br>
>>>>>4.1.2.2、在beans.xml中指定调用构造方法<br>
>>>>>4.1.2.3、如果设定条件匹配多个构造方法将会执行最后一个<br>
>>>>>4.1.2.4、index：参数索引，从0开始；name：参数名；type：类型（区分关键字和封装类的大小写）<br>

>>4.2、实例工厂<br>
>>>4.2.1、工厂设计模式：版主创建类对象，一个工厂可以生产多个对象<br>
>>>4.2.2、实例工厂需要先创建工厂，才能生产对象<br>
>>>4.2.2.1、必须有一个实例化工厂
```java
public class PeopleFactory {
    public People newInstance(){
        return new People(1,"测试",20);
    }
}
```
```xml
   <bean id="factory" class="com.liyan.pojo.PeopleFactory"/>
   <bean id="peo" factory-bean="factory" factory-method="newInstance"/>
```


>>4.3、静态工厂<br>
```xml
 <bean id="peo1" class="com.liyan.pojo.PeopleFactory" factory-method="newInstance"/>
```

给bean的属性赋值
===============
1、通过构造方法赋值<br>
2、设置注入<br>
>>2.1、如果属性是基本数据类型或String等简单类型<br>
```xml
   <bean id="peo" class="com.liyan.pojo.People">
        <property name="id" value="22"/>
        <property name="name" value="张三"/>
        <property name="age" value="20"/>
    </bean>
```
>>2.2、如果属性是Set<?>List<String>时<br>
```xml
 <bean id="peo" class="com.liyan.pojo.People">
        <property name="sets">
            <set>
                <value>1</value>
                <value>2</value>
                <value>3</value>
                <value>4</value>
            </set>
        </property>
    </bean>
```
>>2.2、如果属性是List<String>时<br>
```xml
<bean>
    <property name="list">
         <list>
             <value>1</value>
             <value>2</value>
             <value>3</value>
             <value>4</value>
         </list>
    </property>
    <property name="list" value="1,2,3"/>
</bean>
```
>>2.3、如果属性是数组时<br>
```xml
 <bean>
    <property name="strings">
        <array>
            <value>1</value>
            <value>2</value>
            <value>3</value>
        </array>
    </property>
</bean>
```
>>2.4、如果属性是map<String,String>时<br>
```xml
<bran>
    <property name="map">
         <map>
              <entry key="1" value="2"/>
         </map>
    </property>
</bran>
```


DI
==
1、依赖注入<br>
2、DI是什么<br>
>>2.1、DI和IoC是一样的<br>
>>2.2、当一个类(A)中需要依赖另一个类(B)对象时，把B赋值给A的过程就叫做依赖注入<br>
```xml
<bean>
    <property name="desk" ref="desk"/>
</bean>
<bean id="desk" class="com.liyan.pojo.Desk"/>
```


