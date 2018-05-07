import javax.swing.*;
import java.awt.event.*;

public class SimpleGui1B implements ActionListener { 
	//implement the interface to indicate that this class is an action listener; the button will give events to ActionListener implementers
	
	JButton button;
	
	public static void main (String[] args) {
		SimpleGui1B gui = new SimpleGui1B();
		gui.go();
	}
	
	public void go() {
		
		JFrame frame = new JFrame();
		button = new JButton ("click me");
		
		button.addActionListener(this);
		//register your interest in the button. Add to list of listeners
		
		frame.getContentPane().add(button);//add button to frames content pane
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//program quits when you close the box
		frame.setSize(300, 300);//set size
		frame.setVisible(true);//make visible
	}
	
	public void actionPerformed(ActionEvent event) {
		button.setText("I've been clicked!");//button calls method to tell you an event happened. 
	}

}
