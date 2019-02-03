package ru.sbt.collection;

import java.util.*;
import java.util.Collections;
import ru.sbt.collection.ReverceIter;

public class WorkWithText {
     private static final String TEXT ="src/DZ.txt";

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        Map<String, Integer> result = new TreeMap<>();
        List<String> liststrok=new ArrayList();
        ArrayList<String> list=new ArrayList();


        TextLoader textLoader = new TextLoader();

        System.out.println("Ishodnyi massiv strok");
        liststrok=textLoader.loadFile(TEXT);
        System.out.println(liststrok);
        List<String>copylist=new ArrayList<>(liststrok);

        //разбивка строк на слова
        for (String word:liststrok){
        String[] parts = word.split(" ");
         for (String w : parts) {
            list.add(w);
          }

         }
        ContWordInFile contWordInFile =new ContWordInFile();


        System.out.println("1. CountUniqueWord:");
        set= contWordInFile.getCountWord(list);
        System.out.println(set.size());

        System.out.println("2. Sort word in file");
        TreeSet<Compar>wordSort=new TreeSet<>();
        Iterator iter=set.iterator();
        while (iter.hasNext()){
            wordSort.add(new Compar((String) iter.next()));

        }

        for(Compar cat : wordSort) {
             System.out.println("Имя: " + cat.getStr()+ ", длина: " + cat.getLength() );
        }


       System.out.println("3. Count word");
       result=contWordInFile.getCountWordStatic(list);

        System.out.println("4. Reverce strok");
        Collections.reverse(liststrok);
        System.out.println(liststrok);


        System.out.println("5. ReverceIterator");
        ReverceIter rev = new ReverceIter(list);
        while (rev.hasNext()) {
            System.out.println(rev.next().get(rev.getPosition()));
        }
        System.out.println();

        System.out.println("6. Задание 6");

        boolean quit = false;
        int number;
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите номер строки от 1 до " + copylist.size());
        while (!quit) {
            if (in.hasNextInt()) {
                number = in.nextInt();
                if (number > 0 && number <= copylist.size())
                    System.out.println( copylist.get(number - 1));
            } else
                quit = true;
        }
        System.out.println();
    }
    }




