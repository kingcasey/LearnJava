import javax.swing.*; // import swing package

public class SimpleGui1 {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		JButton button = new JButton("click me");
		// make a frame and a button; pass button constructor text for the button
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this line makes the program quit as soon as you close the window (if you leave this out it will just sit on the screen forever)
		
		frame.getContentPane().add(button);
		//add button to frame's content pane
		
		frame.setSize(300, 300);
		//give the frame a size in pixels
		
		frame.setVisible(true);
		//make the frame visible

	}//end main

}
