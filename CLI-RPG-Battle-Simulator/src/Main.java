public class Main {
    public static void main(String[] args) {
        Warrior W1 = new Warrior("Thrain", 120, 30);
        
        Warrior W2 = new Warrior("Grukk", 130, 12);
        
        Mage M1 = new Mage("Nula", 125, 25, 50);
        
        Battle.fight(W2, W1);
        
    }
}