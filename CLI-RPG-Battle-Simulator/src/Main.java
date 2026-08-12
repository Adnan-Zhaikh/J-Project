public class Main {
    public static void main(String[] args) {
        Warrior W1 = new Warrior("Thrain", 120, 30);
        
        Warrior W2 = new Warrior("Grukk", 130, 12);

        W1.attack(W2);

        System.out.println(W2.getHealth());

        Mage M1 = new Mage("Nula", 125, 25, 30);

        M1.attack(W2);
        M1.attack(W1);
        M1.attack(W2);
        M1.attack(W2);
        
        System.out.println(W2.getHealth());

        W2.heal(43);

        System.out.println("After Healing " + W2.getName() + ", HP is " + W2.getHealth() + "/" + W2.getMaxHealth());

    }
}