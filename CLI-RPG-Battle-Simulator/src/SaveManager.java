import java.io.*;

public class SaveManager {
    
    public static void saveWarrior(Warrior w, String filename) {
        try (FileWriter writer = new FileWriter(filename)){
            writer.write(w.getName() + "\n");
            writer.write(w.getHealth() + "\n");
            writer.write(w.getAttackPower() + "\n");

        } catch (IOException e) {
            System.out.println("Error saving: " + e.getMessage());
        }
    }

    public static Warrior loadWarrior(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String name = reader.readLine();
            int health = Integer.parseInt(reader.readLine());
            int attackPower = Integer.parseInt(reader.readLine());

            Warrior w1 = new Warrior(name, health, attackPower);
            return w1;

        } catch (IOException e) {
            System.out.println("Error loading: " + e.getMessage());
            return null;
        }
    }
}
