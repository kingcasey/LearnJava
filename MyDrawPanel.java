import java.awt.*;
import javax.swing.*;

class MyDrawPanel extends JPanel {
	//make a sublass of JPanel, a widget that you can add to a frame; a customized widget


	public void paintComponent (Graphics g) {
		///system calls the graphics method and gives a drawing surface of type "Graphics" that you can paint on; you don't call the graphics method directly
		//g.setColor(Color.orange);
		//g.fillRect(20, 50, 100, 100);
		// provide color for paint and what shape using coordinates
		
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
		
		Color randomColor = new Color (red, green, blue);
		g.setColor(randomColor);
		g.fillOval(70, 70, 100, 100);
	}

}
