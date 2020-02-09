package com.zl.lennon.ifelse;

public class StrategyOther implements Strategy {

    @Override
    public void apply(Integer type) {
        System.out.println(type);
    }
}
