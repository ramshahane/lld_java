
class Character {
    String name;
    int health;

    void attack() {
        System.out.println(name + " is attacking!");
    }
}

class Warrior extends Character {
    void specialAttack() {
        System.out.println(name + " uses a sword attack!");
    }
}

public class Main {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();

        warrior.name = "Thor";
        warrior.health = 100;

        warrior.attack();
        warrior.specialAttack();

        System.out.println("Health: " + warrior.health);
    }
}
