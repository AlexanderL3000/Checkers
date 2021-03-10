import java.awt.Canvas;

public class Main extends Canvas implements Runnable{
	
	
	private boolean running = false;
	private Thread thread;
	
	
	public static void main(String[] args) {
		new Window(1000,1000, new Main());
	}
	
	public synchronized void start() {
		if(running) return;
		
		running = true;
		thread = new Thread(this);
		thread.start();
	}
	public void run() {
		System.out.println("Test");
		
	}
	

}
