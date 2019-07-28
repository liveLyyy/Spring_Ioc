package com.liyan.test;

import com.liyan.pojo.People;
import com.liyan.pojo.PeopleFactory;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class PeopleTest {
    @Test
    public void Peple() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        People people = applicationContext.getBean("peo", People.class);
        System.out.println(people);
//        String[] strings=applicationContext.getBeanDefinitionNames(p);
//        for (String s:strings){
//            System.out.println();
//        }
      System.out.println(people);

    }
}
