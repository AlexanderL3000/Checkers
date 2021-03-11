import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Window {

	private JFrame frame = new JFrame();

	Window(int width, int height, Main main){
		Time t = new Time();
		JFrame.setDefaultLookAndFeelDecorated(true);
		
		JPanel timePanel = new JPanel();
		JPanel blankPanel = new JPanel();
		List<JPanel> panels = new ArrayList<JPanel>();
		
	
		
		frame.setLayout(new GridLayout(3,4));
		timePanel.setBackground(Color.yellow);
		frame.add(timePanel);
		for(int i = 0; i <9; i++) {
			panels.add(new JPanel());
			
		}
		for(int i = 0; i <9; i++) {
			
			
			panels.get(i).setBackground(new Color((int)(Math.random() * 0x1000000)));
			frame.add(panels.get(i));
			
			
		}
		//timePanel.setLayout(new GridLayout(2,1));
	
		timePanel.add(main);
		timePanel.add(t.getTime());
		t.start();
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		
	}

}
