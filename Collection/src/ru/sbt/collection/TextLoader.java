package ru.sbt.collection;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class TextLoader {

    public List<String> list = new ArrayList<>();
    public List<String> lines = new ArrayList<>();
    public List<String> loadFile(String file) {

     try{
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();

        while(line !=null) {
         lines.add(line);//загружаем строки

         line = br.readLine(); }
     }
     catch(FileNotFoundException e){
         System.out.println("File not found!");
         lines=null;
     }
     catch(IOException e){
         lines=null;
     }
      return lines;
 }
}