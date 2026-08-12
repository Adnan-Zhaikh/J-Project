public class Battle {
    public static void fight(Character c1, Character c2) {
        boolean c1Turn = true;

        while (c1.isAlive() && c2.isAlive()) {
            if (c1Turn) {
                c1.attack(c2);
            } else {
                c2.attack(c1);
            }

            c1Turn = !c1Turn;
        }

        if (c1.isAlive()) {
            System.out.println("The Winner is " + c1.getName());
        } else {
            System.out.println("The Winner is " + c2.getName());
        }

        if (c1.isAlive()) {
            System.out.println("The Winner's HP " + c1.getHealth());
        } else {
            System.out.println("The Winner's HP " + c2.getHealth());
        }
    }
}
