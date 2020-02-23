package com.course.testng;

import org.testng.annotations.Test;

public class ExpectedExcption {
    /**
     * 预期结果为某一个异常的时候
     */
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.print("This is runTimeException");
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.print("This is runTimeException");
        throw new RuntimeException();
    }
}
