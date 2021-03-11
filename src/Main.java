import java.awt.Canvas;

public class Main extends Canvas{
	
	
	private boolean running = false;
	private Thread thread;
	private int seconds = 0;
	
	public static void main(String[] args) {
		//new Time();
		new Window(100,100,new Main());
	}
	
	

	

	
}
