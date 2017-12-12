import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PlayField extends JPanel {

    private int posX = 20;
    private int posY = 150;
    private int horSize = 10;    
    private int verSize = 100;


    public void paintComponent(Graphics g) {
	super.paintComponent(g);
	this.setBackground(Color.WHITE);

	g.setColor(Color.BLACK);
	g.fillRect(posX, posY, horSize, verSize);

	g.setColor(Color.BLACK);
	g.fillRect(570, posY, horSize, verSize);	
    }


}
