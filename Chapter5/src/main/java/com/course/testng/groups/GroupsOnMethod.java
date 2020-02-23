package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {
    @Test(groups = "server")
    public void test1(){
        System.out.print("server test1");
    }
    @Test(groups = "server")
    public void test2(){
        System.out.print("server test2");
    }

    @Test(groups = "client")
    public void test3(){
        System.out.print("client test3");
    }

    @Test(groups = "client")
    public void test4(){
        System.out.print("client test4");
    }
    @BeforeGroups("server")
    public void beforeGroupsOnserver(){
        System.out.print("Before Server Groups");
    }

    @AfterGroups("server")
    public void afterGroupsOnserver(){
        System.out.print("After Server Groups");
    }

    @BeforeGroups("client")
    public void beforeGroupsOnClient(){
        System.out.print("Before Client Groups");
    }

    @AfterGroups("client")
    public void afterGroupsOnClient(){
        System.out.print("After Client Groups");
    }

}
