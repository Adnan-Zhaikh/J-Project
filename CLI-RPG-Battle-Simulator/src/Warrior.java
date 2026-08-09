public class Warrior extends Character {

    public Warrior(String name, int health, int attackPower) {
        super(name, health, attackPower);

    }

    @Override
    public void attack(Character target) {
        System.out.println(getName() + " Slashes " + target.getName() + "!");
        
        target.takeDamage(getAttackPower());

    }
}