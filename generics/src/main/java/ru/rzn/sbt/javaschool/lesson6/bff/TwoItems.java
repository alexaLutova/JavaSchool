package ru.rzn.sbt.javaschool.lesson6.bff;

public class TwoItems<T > {
    T item1;
    T item2;

    public TwoItems(T item1, T item2){
        this.item1=item1;
        this.item2=item2;
    }
    public T getItem1(){
        return item1;
    }
    public  T getItem2(){
        return item2;
    }



}
