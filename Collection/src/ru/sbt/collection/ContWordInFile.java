package ru.sbt.collection;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;
import java.util.List;
import java.util.TreeMap;


public class ContWordInFile {

    public Set<String> getCountWord(List<String> list) {

        Set<String> set = new HashSet<>();

                for (String w : list) {
                    set.add(w);
                }


        return set;
    }

    public Map<String, Integer> getCountWordStatic(List<String> list) {
        Map<String, Integer> result = new TreeMap<>();

                for (String w : list) {
                    if (result.containsKey(w)) {
                        result.put(w, result.get(w) + 1);
                    } else {
                        result.put(w, 1);
                    }
                }

            for (String word : result.keySet())
            {
                System.out.println(word + " " + result.get(word));
            }

        return result;
    }

}