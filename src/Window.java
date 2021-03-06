import java.awt.Dimension;

import javax.swing.JFrame;

public class Window {
	Window(int width, int height){
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame();
		
		frame.pack();
		
		frame.setVisible(true);
		frame.setPreferredSize(new Dimension(width, height));
		frame.setMaximumSize(new Dimension(width, height));
		frame.setMinimumSize(new Dimension(width, height));
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		
	}
	
}
