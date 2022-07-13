package com.example.polymorphism_exercise;

public class Warrior extends Person{
    private Weapon weapon;
    public Warrior(String name){
    super(name);
    }

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public void decHealth(int amt){
        super.health = Math.max(0, health - amt);
    }
    public void attack(Warrior opponent){
        if(opponent.health >0 && this.health>0 && this.weapon != null){
            System.out.println(this.name);
            System.out.println(opponent.name);
            System.out.println(opponent.health);
        }
    }

}
