package ru.rzn.sbt.javaschool.lesson3.army;

import java.util.Objects;

/**
 * Оружие
 */
final public class Weapon {

    /**
     * Тип оружия
     */
    private final WeaponType weaponType;

    /**
     * Урон
     */
    private final int damage;

    /**
     * Стоимость
     */
    private final int cost;

    public Weapon(WeaponType weaponType, int damage, int cost) {
        this.weaponType = weaponType;
        this.damage = damage;
        this.cost = cost;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public int getDamage() {
        return damage;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public boolean equals(Object obj){
        if (this==obj) return true;
        if (obj==null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Weapon weapon=(Weapon) obj;
        return damage==weapon.damage && cost==weapon.cost &&
                (weaponType==weapon.weaponType || (weaponType != null && weaponType.equals(weapon.weaponType)));





    }
}
