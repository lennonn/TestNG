package com.zl.lennon.string;

import org.junit.Test;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class StringPermutationsTest {
    @Test
    public void permutiationTest(){
        StringPermutations.permutation("AAB");
        List permSet = StringPermutations.permSet;
        permSet.forEach(System.out::println);
    }
}
