package ua.lviv.lga.lesson18.task02;

import java.security.KeyStore;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;


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

        Iterator<Entry<K, V>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getKey().equals(key)) {
                iterator.remove();
            }
        }


    }

    public void removeByValue(V val) {

        Iterator<Entry<K, V>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getValue().equals(val)) {
                iterator.remove();
            }
        }


    }

    public void keySetSchow() {
        Set<Entry<K, V>> myEnt = map.entrySet();
        for (Entry<K, V> me : myEnt) {
            System.out.println(me.getKey().toString());


        }


    }

    public void valueListSchow() {
        Set<Entry<K, V>> myEnt = map.entrySet();
        for (Entry<K, V> me : myEnt) {
            System.out.println(me.getValue().toString());


        }


    }

    public void showMap() {

        Set<Entry<K, V>> myEnt = map.entrySet();
        for (Entry<K, V> me : myEnt) {
            System.out.println("key :" + me.getKey().toString() + " value :" + me.getValue().toString());


        }


    }


}
