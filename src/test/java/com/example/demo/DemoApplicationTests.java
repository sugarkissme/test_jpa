package com.example.demo;

import com.example.demo.constant.Season;
import com.example.demo.method.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Test
    public void contextLoads() {
        System.out.println("true = " + Season.getPosion("WINTER"));


    }


    @Test
    public void classLoads() throws  Exception{
        Class clazz=Person.class;
        Person p= (Person) clazz.newInstance();
        Method setDate = clazz.getMethod("setDate",Date.class);
        setDate.invoke(p,new Date());


        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);
        name.set(p,"tom");
        System.out.println("p = " + p);

    }
    public static void mai1(String[] args)  {

    }

}
