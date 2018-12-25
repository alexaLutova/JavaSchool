package ru.rzn.sbt.javaschool.basics;
import java.util.Objects;
public class LethalWeapon {
    public static long nextSerial=0;
    public final long serial;

    public long getSerial(){
        return serial;
    }
public String color;
private int roundsLeft;
private double power;

public Double getPower(){
  return power;
}

public void setPower(){
    this.power=power;
}

public void reload(int j){
    roundsLeft+=j;
}

public void pewPew(){
    roundsLeft-=2;
}

public LethalWeapon(){
  serial=nextserial;
  nextserial++; 
}


public LethalWeapon(String color,Double power,int roundsLeft ){
    this.color=color;
    this.power=power;
    this.roundsLeft=roundsLeft;

    serial=nextserial;
    nextserial++; 
}

}
