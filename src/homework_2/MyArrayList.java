package org.example.homework_2;

import java.util.ArrayList;
import java.util.Iterator;
public class MyArrayList<T> extends ArrayList<T> {
    @Override
    public String toString() {
        Iterator<T> it = iterator();
        if (! it.hasNext())
            return "[]";

        StringBuilder sb = new StringBuilder();
        sb.append("[\n");
        for (;;) {
            T e = it.next();
            sb.append("\t\t");
            sb.append(e == this ? "(this Collection)" : e);
            if (! it.hasNext())
                return sb.append("\n\t]").toString();
            sb.append(',').append("\n");
        }
    }
}

//Iterator<Map.Entry<K,V>> i = entrySet().iterator();
//        if (! i.hasNext())
//        return "{}";
//
//StringBuilder sb = new StringBuilder();
//        sb.append("{\n");
//        for (;;) {
//Map.Entry<K,V> e = i.next();
//V value = e.getValue();
//            sb.append("\t");
//            sb.append(value == this ? "(this Map)" : value);
//            if (! i.hasNext())
//        return sb.append("\n}").toString();
//            sb.append(',').append("\n");
//        }
