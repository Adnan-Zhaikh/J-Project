import javax.swing.*;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Instantiate a RockPaperScissor GUI obj
                RockPaperScissorGUI rockPaperScissorGUI = new RockPaperScissorGUI();

                // Display the GUI
                rockPaperScissorGUI.setVisible(true);

            }
        });
    }
}
