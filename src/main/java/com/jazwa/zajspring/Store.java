package com.jazwa.zajspring;

import java.util.List;

public class Store {
    private List<Item> items;

    public Store(List<Item> items) {
        this.items = items;
    }

    public Store() {
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
