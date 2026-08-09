public class Mage extends Character {
    private int mana;

    public Mage(String name, int health, int attackPower, int mana) {
        
        super(name, health, attackPower);
        this.mana = mana;
    }

    @Override
    public void attack(Character target) {
        if (mana >= 10) {
            System.out.println(getName() + " casts a fireball at " + target.getName());
            target.takeDamage(getAttackPower());
            mana = mana - 10;

        } else {
            System.out.println(getName() + " is out of mana!");
        }

    }
}