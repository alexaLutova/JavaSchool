package ru.rzn.sbt.javaschool.lesson6.bff;

import java.util.*;

public class Solution {

    /**
     * 1. Создайте обобщённый класс TwoItems, параметризовынный типом <T> и хранящий две ссылки на объекты типа T.
     * Введите конструктор, принимающий два аргумента и get-методы.
     *
     * 2. В {@link Collection} persons найдите персоны, у которых взаимно совпадают ссылки на лучших друзей
     * {@link Person#bestFriend}, сформируйте из них экземпляры класса TwoItems<Person> и разместите
     * в {@link Collection}<TwoItems>.
     *
     * 3. В качестве результата выполнения метода {@link Solution#findBestFriends(Collection)} верните размер коллекции
     * с парами лучших друзей.
     */
    public static int findBestFriends(Collection<Person> persons) {
        Collection<TwoItems<Person>> set=new HashSet<>();
        for (Person i:persons){
            if (i==null) continue;
            Person BestFriend_i=i.getBestFriend();
            for (Person j:persons){
                if (j==null) continue;
                if (j==i) continue;
                Person BestFriend_j=j.getBestFriend();

                if ((BestFriend_i==j) && (BestFriend_j==i)) {

                    set.add(new TwoItems<>(i,j));
                }

            }
        }
        if (set!=null)return set.size()/2;
        else return 0;



    }
}
