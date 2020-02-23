package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "student")
public class GroupsOnClass1 {
    public void student1(){
        System.out.print("GroupsOnClass1's student1'");
    }

    public void student2(){
        System.out.print("GroupsOnClass1's student2'");
    }
}
