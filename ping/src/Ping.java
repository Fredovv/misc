import javax.swing.*;

public class Ping {

    public static void main(String[] args) {
	JFrame pingFrame = new JFrame("Ping");
	pingFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	PlayField playField = new PlayField();
	pingFrame.add(playField);
	pingFrame.setSize(600, 400);
	pingFrame.setVisible(true);

    }
    
}
