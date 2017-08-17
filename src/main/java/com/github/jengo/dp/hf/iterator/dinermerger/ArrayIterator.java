package com.github.jengo.dp.hf.iterator.dinermerger;

public class ArrayIterator implements Iterator {

    private MenuItem[] items;
    private int position = 0;

    public ArrayIterator(MenuItem[] items) {
        this.items = items;
    }

    public MenuItem next() {
        MenuItem menuItem = items[position];
        position = position + 1;
        return menuItem;
    }

    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }

}
