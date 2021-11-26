package com.zl.lennon.collections;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestAddAttr {
    private List<LastInfo> infos = new ArrayList<LastInfo>();

    public List<LastInfo> getInfos() {
        return infos;
    }

    public void setInfos(List<LastInfo> infos) {
        this.infos = infos;
    }

    public void testContain(){
        String id ="a1";
        LastInfo lastInfo= infos.stream().filter(i->i.getId().equals("a1")).findFirst().orElse(null);
        if(lastInfo==null){
            lastInfo = new LastInfo();
            lastInfo.setId("a1");
            lastInfo.setAvgDof("avg_new");
            lastInfo.setAvgSse("sse_new");
            infos.add(lastInfo);
        }else{
            lastInfo.setAvgDof("avg_old");
            lastInfo.setAvgSse("sse_old");
        }
    }

    public static void main(String ... args){
        TestAddAttr testAddAttr = new TestAddAttr();
        testAddAttr.testContain();
        System.out.println(testAddAttr.getInfos().toString());
        testAddAttr.testContain();
        System.out.println(testAddAttr.getInfos().toString());
    }

    @Test
    public void testListAddAll(){
        List<String> list1 = Collections.EMPTY_LIST;
        List<String> list2 =new ArrayList<>();
        list2.add("sdfdsf");
        list1.addAll(list2);
        Collections.emptyList();
    }
}
