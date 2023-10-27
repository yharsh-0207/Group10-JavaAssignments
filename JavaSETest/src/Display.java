
public class Display {
	
	static synchronized void disp() {
		
		for(int i = 0; i < 10; i++)
		System.out.println(Thread.currentThread().getName() + "\t" + i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable ref = Display::disp;
		Runnable ref1 = ()->{Display.disp();};
		
		
		
		Thread t1 = new Thread(ref1, "First");
		Thread t2 = new Thread(ref1, "Second");
		
		t1.start();
		t2.start();
	}

}
