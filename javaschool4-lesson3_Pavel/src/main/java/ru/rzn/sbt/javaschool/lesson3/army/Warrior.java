package ru.rzn.sbt.javaschool.lesson3.army;

import java.util.Objects;

/**
 * Воин
 */
final public class Warrior {
    /**
     * Оружие
     */
    private Weapon weapon;

    /**
     * Сила
     */
    private final int strength;

    public Warrior(int strength) {
        this(null, strength);
    }

    public Warrior(Weapon weapon, int strength) {
        this.weapon = weapon;
        this.strength = strength;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int getStrength() {
        return strength;
    }


    @Override
    public boolean equals(Object obj){
            if (this==obj) return true;
            if (obj==null) return false;
            if (this.getClass() != obj.getClass()) return false;
            Warrior warrior= (Warrior) obj;
            return strength==warrior.strength && (weapon==warrior.weapon || (weapon != null && weapon.equals(warrior.weapon)));


    }
}
