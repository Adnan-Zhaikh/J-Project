import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Warrior grukk = new Warrior("Grukk", 130, 12);
        Mage nula = new Mage("Nula", 125, 25, 50);

        boolean running = true;
        while (running) {
            System.out.println("1. Fight\n2. Save Grukk\n3. Load Grukk\n4. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Battle.fight(grukk, nula);
                    break;
                case 2:
                    SaveManager.saveWarrior(grukk, "data.txt");
                    break;
                case 3:
                    Warrior loaded = SaveManager.loadWarrior("data.txt");
                    System.out.println(loaded.getName() + " " + loaded.getHealth() + " " + loaded.getAttackPower());
                    break;
                case 4:
                    running = false;                            
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}