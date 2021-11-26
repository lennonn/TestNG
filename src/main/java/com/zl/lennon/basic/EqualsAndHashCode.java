package com.zl.lennon.basic;

public class EqualsAndHashCode {
    int count;

    public static void main(String[] args) {
        EqualsAndHashCode eahc = new EqualsAndHashCode();
        EqualsAndHashCode eahc1 = new EqualsAndHashCode();
        System.out.println(eahc.equals(eahc1));
    }
}
