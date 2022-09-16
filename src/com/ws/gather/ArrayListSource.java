package com.ws.gather;

import java.util.ArrayList;
import java.util.List;
@SuppressWarnings({"all"})
public class ArrayListSource {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("111");
        list.add("222");
        list.add("333");
        list.add(null);
        list.add(true);
        list.add(4444);
        list.add(5555);

        System.out.println(list);
    }
}
