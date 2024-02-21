package ua.lviv.lga.lesson18.task02;

import java.security.KeyStore;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public class Map<K, V> extends MyEntry<K, V> {
    private HashMap<K, V> map;

    public Map(K key, V value) {
        super(key, value);
        this.map = new HashMap<K, V>();
        this.map.put(key, value);
    }

    public void addToMap(K key, V val) {

        map.put(key, val);
    }

    public void removeByKey(K key) {

        Iterator<java.util.Map.Entry<K, V>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getKey().equals(key)) {
                iterator.remove();
            }
        }


    }

    public void removeByValue(V val) {

        Iterator<java.util.Map.Entry<K, V>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getValue().equals(val)) {
                iterator.remove();
            }
        }


    }

    public void keySetSchow() {
        Set<java.util.Map.Entry<K, V>> myEnt = map.entrySet();
        for (java.util.Map.Entry<K, V> me : myEnt) {
            System.out.println(me.getKey().toString());


        }


    }

    public void valueListSchow() {
        Set<java.util.Map.Entry<K, V>> myEnt = map.entrySet();
        for (java.util.Map.Entry<K, V> me : myEnt) {
            System.out.println(me.getValue().toString());


        }


    }

    public void showMap() {

        Set<java.util.Map.Entry<K, V>> myEnt = map.entrySet();
        for (java.util.Map.Entry<K, V> me : myEnt) {
            System.out.println("key :" + me.getKey().toString() + " value :" + me.getValue().toString());


        }


    }


}
