package com.mypackage;

import java.util.ArrayList;
import java.util.List;

public class MyList {
    private List<Integer> list = new ArrayList<Integer>();

    public void add(int number) {
        list.add(number);
    }

    public int size() {
        return list.size();
    }

    public boolean contains(int number) {
        return list.contains(number);
    }

    public void remove(int number) {
        list.remove((Object) number);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}
