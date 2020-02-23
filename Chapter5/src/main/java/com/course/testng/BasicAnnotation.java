package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    @Test
    public void testCase1(){
        System.out.println("test1 Thread Id : " + Thread.currentThread().getId());
        System.out.print("这是测试用例1");
    }

    @Test
    public void testCase2(){
        System.out.println("test1 Thread Id : " + Thread.currentThread().getId());
        System.out.print("这是测试用例2");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.print("BeforeMethod");
        System.out.print("换行测试");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.print("AfterMethod");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.print("BeforeClass");
    }

    @AfterClass
    public void afterClass(){
        System.out.print("AfterClass");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.print("Before Test");
    }

    @AfterTest
    public void afterTest(){
        System.out.print("After Test");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.print("BeforeSuite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.print("AfterSuite");
    }
}
