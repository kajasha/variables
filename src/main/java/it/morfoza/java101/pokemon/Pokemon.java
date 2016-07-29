package it.morfoza.java101.pokemon;


public class Pokemon {
    private String name;
    private long health = 1000;
    private long combatPower;

    public Pokemon(String name, long combatPower) {
        this.name = name;
        this.combatPower = combatPower;
    }

    public Pokemon(String name) {
        this.name = name;
    }

    public String toString() {
        return "Pokemon: " + name + " health : " + health;

    }

    public void takeAttack(long attackStrength) {
        health -= attackStrength;
    }

    public boolean isAllive() {
        if (health < 0) {
            return false;
        } else {
            return true;
        }
    }

    public void attack(Pokemon enemy) {
        enemy.takeAttack(combatPower);
    }
}
