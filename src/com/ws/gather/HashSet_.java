package com.ws.gather;

import java.util.HashSet;
import java.util.Set;
@SuppressWarnings({"all"})
public class HashSet_ {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("111");
        set.add("222");
        set.add("333");
        System.out.println(set.add("333"));//元素不能重复，且不保证存放元素的顺序和取出顺序一致
        System.out.println(set);
    }
}
