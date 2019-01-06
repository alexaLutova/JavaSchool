package ru.rzn.sbt.javaschool.basics;

import java.util.Objects;

public class LethalWeapon {
    public static long nextSerial=0;
    public final long serial=2;

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

public LethalWeapon(){}


public LethalWeapon(String color,Double power,int roundsLeft ){
    this.color=color;
    this.power=power;
    this.roundsLeft=roundsLeft;
}
@Override
public boolean equals(Object obj){
   if (obj==this) {
       return true;
    }
   if (obj==null) {
       return false;
    }
   if (obj.getClass()!=this.getClass()) {
       return false;
    }
   LethalWeapon k=(LethalWeapon) obj;
   return power==k.power && roundsLeft==k.roundsLeft &&
           (color==k.color || (color != null && color.equals(k.color)))            ;

}

@Override
public int hashCode(){
       return Objects.hash(color,power,roundsLeft);
    }


}
