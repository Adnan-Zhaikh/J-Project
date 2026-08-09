public abstract class Character {
    private String name;
    private int health;
    private int maxHealth;
    private int attackPower;

    public Character(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        maxHealth = health;
    }

    public abstract void attack(Character target);

    public void takeDamage(int amount) {
        health = health - amount;
    }

    public boolean isAlive() {
        boolean isAlive = health > 0;
        return isAlive;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getAttackPower() {
        return attackPower;
    }
}