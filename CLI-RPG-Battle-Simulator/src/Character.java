import java.util.ArrayList;
import java.util.HashMap;

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
    
    private ArrayList<Usable> inventory = new ArrayList<>();
    
    public void addItem(Usable item) {
        inventory.add(item);
    }
    
    public void useItem(int index) {
        inventory.get(index).use(this);
    }

    public void heal(int amount) {
        health = Math.min(health + amount, maxHealth);
    }

    private HashMap<String, Integer> statusEffects = new HashMap<>();

    public void applyPoison(int turns) {
        statusEffects.put("Poison", turns);
    }

    public void tickStatusEffects() {
        if (statusEffects.containsKey("Poison")) {
            takeDamage(5);
            statusEffects.put("Poison", statusEffects.get("Poison") - 1);
            if (statusEffects.get("Poison") == 0) {
                statusEffects.remove("Poison");
            }

        }
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