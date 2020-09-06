package com.zl.lennon;

import org.testng.annotations.Test;

import java.util.Arrays;

public class Temp {
    @Test
    public void test(){
        String tmp ="[\"2222\",\"33333\"]";
        String sub =tmp.substring(1,tmp.length()-1);
        String arr[] = sub.split(",");
        System.out.println(Arrays.toString(arr));
    }




}
