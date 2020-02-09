package com.zl.lennon.algorithmic;

import org.junit.Test;
import org.testng.Assert;
import org.testng.annotations.*;

public class SearchTest {

    @Test
    public void testBinarySearch(){
        int nums[] ={1,2,3,4,5};
        int index=Search.binarySearch(nums,2);
        Assert.assertEquals(index,1);
    }

}
