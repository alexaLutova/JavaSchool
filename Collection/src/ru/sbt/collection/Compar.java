package ru.sbt.collection;

public class Compar implements Comparable<Compar> {
    private String str;
    private Integer length;
    public Compar(String st){
        this.str=st;
        this.length=st.length();

    }
    public String getStr(){
        return str;
    }
    public int getLength(){
        return length;
    }
    @Override
    public int compareTo(Compar obj){
        int result = this.length.compareTo(obj.length);
        if (result == 0) {
            result = this.str.compareTo(obj.str);
        }
        return result;
    }
}
