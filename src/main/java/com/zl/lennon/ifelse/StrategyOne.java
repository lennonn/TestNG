package com.zl.lennon.ifelse;

public class StrategyOne implements Strategy {

    @Override
    public void apply(Integer type) {
        System.out.println(type);
    }
}
