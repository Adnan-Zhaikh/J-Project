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

    public static Character createCharacter(Scanner sc) {
        System.out.println("Choose class: 1. Warrior  2. Mage");
        int classChoice = sc.nextInt();
        sc.nextLine(); // flush leftover newline

        System.out.println("Enter name:");
        String name = sc.nextLine();

        System.out.println("Enter health:");
        int health = sc.nextInt();

        System.out.println("Enter attack power:");
        int attackPower = sc.nextInt();

        if (classChoice == 1) {
            Warrior w1 = new Warrior(name, health, attackPower);
            return w1;

        } else if (classChoice == 2) {
            System.out.println("Enter Mana:");
            int mana = sc.nextInt();
            Mage m1 = new Mage(name, health, attackPower, mana);
            return m1;

        } else {
            System.out.println("Invalid Choice");
            return null;
        }
    }
}