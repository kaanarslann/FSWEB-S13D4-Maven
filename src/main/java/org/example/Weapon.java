package org.example;

public enum Weapon {
    SWORD(50, 5.5),
    WAND(40, 8.3),
    PISTOL(45, 5);

    private int damage;
    private double attackSpeed;

    Weapon(int damage, double attackSpeed){
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

    public int getDamage(){
        return damage;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }
}
