public class Main {
    public static void main(String[] args) {
        Warrior W1 = new Warrior("Thrain", 120, 30);
        
        Warrior W2 = new Warrior("Grukk", 130, 12);

        W1.attack(W2);

        System.out.println(W2.getHealth());
    }
}