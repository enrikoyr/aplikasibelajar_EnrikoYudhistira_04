package com.example.aplikasibelajar.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class DummyContent {


    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();


    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    static {
        addItem(new DummyItem("1", "Class", "file:///android_asset/class.html"));
        addItem(new DummyItem("2", "Operators", "file:///android_asset/operator.html"));
        addItem(new DummyItem("3", "Relation", "file:///android_asset/relation.html"));
        addItem(new DummyItem("4", "Methods", "file:///android_asset/methods.html"));
        addItem(new DummyItem("5", "Constructor", "file:///android_asset/constructor.html"));
        }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }


    public static class DummyItem {
        public final String id;
        public final String materi;
        public final String deskripsi;

        public DummyItem(String id, String materi, String deskripsi) {
            this.id = id;
            this.materi = materi;
            this.deskripsi = deskripsi;
        }

        @Override
        public String toString() {
            return materi;
        }
    }
}
