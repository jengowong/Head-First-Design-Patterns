package com.github.jengo.dp.hf.iterator.dinermerger;

import java.util.ArrayList;
import java.util.List;

public class ArrayListIterator implements Iterator {

    private List<MenuItem> items;
    private int position = 0;

    public ArrayListIterator(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public MenuItem next() {
        MenuItem item = items.get(position);
        position = position + 1;
        return item;
    }

    public boolean hasNext() {
        if (position >= items.size()) {
            return false;
        } else {
            return true;
        }
    }

}
