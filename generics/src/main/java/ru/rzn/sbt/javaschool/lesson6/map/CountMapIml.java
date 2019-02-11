package ru.rzn.sbt.javaschool.lesson6.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountMapIml<T> implements CountMap<T>{
    private Map<T,Integer> map;

    public CountMapIml() {
        this.map = new HashMap<>();

    }

    @Override
    public void add(T o){
        if (null==o) {
            throw new NullPointerException();
        }
        if (map.containsKey(o)) {
         map.put(o,map.get(o)+1);
        } else {
            map.put(o,1);
        }
    }

    @Override
    public int getCount(T o)  {
        if (o==null) throw new NullPointerException();
        if (map.containsKey(o)) {
           return map.get(o);
        }
        return 0;
    }

    @Override
    public int remove(T o){

        int count=0;
        try {
            count = getCount(o);
            if (count > 1) {
                map.put(o, count - 1);
            } else if (count == 1) {
                map.remove(o);
            }
        }catch(NullPointerException e){
            throw e;
        }
        return count;
    }

    @Override
    public int size(){
        return map.size();
    }

    @Override
    public void addAll(CountMap source){
        if (null == source) throw new NullPointerException();
        Map<T, Integer> sour=source.toMap();

        for (T i:sour.keySet()){
            int count= getCount(i);
            map.put(i,sour.get(i)+count);
        }


    }

    @Override
    public Map toMap(){

        return map;

    }

    @Override
    public void toMap(Map destination) throws NullPointerException {
        if (destination!=null) {
            if (destination == this.map) return;
            destination.clear();
            destination.putAll(map);
        }else throw new NullPointerException();

    }




}
