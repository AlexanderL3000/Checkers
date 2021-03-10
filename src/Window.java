import java.awt.Dimension;

import javax.swing.JFrame;

public class Window {
	Window(int width, int height, Main main){
		JFrame.setDefaultLookAndFeelDecorated(true);

		
		main.setPreferredSize(new Dimension(width, height));
		main.setMaximumSize(new Dimension(width, height));
		main.setMinimumSize(new Dimension(width, height));
		
		JFrame frame = new JFrame();
		frame.add(main);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		main.start();
		
	}
	
}
