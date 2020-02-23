package com.course.testng;

import org.testng.annotations.Test;

public class IgnoreTest {
    @Test
    public void ignore1(){
        System.out.print("ignore1 running");
    }

    @Test(enabled = false)
    public void ignore2(){
        System.out.print("ignore1 running");
    }

    @Test(enabled = true)
    public void ignore3(){
        System.out.print("ignore3 running");
    }
}
