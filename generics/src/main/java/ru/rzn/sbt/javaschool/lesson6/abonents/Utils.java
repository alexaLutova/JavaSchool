package ru.rzn.sbt.javaschool.lesson6.abonents;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public class Utils {
    public static <T, R> Collection<R> transform(Collection<T> src, Function<T, R> function) {
        Collection<R> result = new ArrayList<>();
        for(T item: src) {
            result.add(function.apply(item));
        }
        return result;
    }

}
