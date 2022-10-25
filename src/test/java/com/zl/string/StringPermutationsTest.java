package com.zl.string;

import org.junit.Test;

import java.util.List;

public class StringPermutationsTest {
    @Test
    public void permutiationTest(){
        StringPermutations.permutation("AAB");
        List permSet = StringPermutations.permSet;
        permSet.forEach(System.out::println);
    }
}
