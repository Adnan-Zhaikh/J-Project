public class HealthPotion implements Usable {
    private String name;
    private int healAmount;

    public HealthPotion(String name, int healAmount){
        this.name = name;
        this.healAmount = healAmount;
    }

    @Override
    public void use(Character target) {
        target.heal(healAmount);
        System.out.println(name + " heals " + target.getName() + " for " + healAmount + " HP!");
    }
}