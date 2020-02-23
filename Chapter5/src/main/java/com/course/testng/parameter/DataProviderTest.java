package com.course.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;


public class DataProviderTest {
    @Test(dataProvider = "data")
    public void testDataProvider(String name, int age){
        System.out.print("Name : " + name + "; Age : " + age);
    }

    @DataProvider(name = "data")
    public Object[][] providerData(){
        Object[][] obj = new Object[][]{
                {"ZhangSan",16},
                {"LiSi",30},
                {"WangWu",40}
        };
        return obj;
    }

    @Test(dataProvider = "methodData")
    public void test1(String name, int age){
        System.out.print("test1 Name : " + name + "; Age : " + age);
    }

    @Test(dataProvider = "methodData")
    public void test2(String name, int age){
        System.out.print("test2 Name : " + name + "; Age : " + age);
    }
    @DataProvider(name = "methodData")
    public Object[][] methodDataTest(Method method){
        Object[][] result = null;
        if ("test1".equals(method.getName())){
            result = new Object[][]{
                    {"ZhangSan", 20},
                    {"LiSi", 30}
            };
        }
        if ("test2".equals(method.getName())){
            result = new Object[][]{
                    {"WangWu", 40},
                    {"ZHAOLiu", 50}
            };
        }
        return result;
    }
}
