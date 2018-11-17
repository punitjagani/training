import java.nio.charset.MalformedInputException;

public class SyncDemo implements Runnable {

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		display(name);
	}
	
	//private synchronized void display(String name) { //making the code Thread safe 
//		try {
//			System.out.print("[");
//			Thread.sleep(100);
//			System.out.print(name);
//			Thread.sleep(100);
//			System.out.print("]");
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		public void display(String name) {
		try {
			synchronized(this) {     //only this part of the code is synchronized inside the method
		
			System.out.print("[");
			Thread.sleep(100);
			System.out.print(name);
			Thread.sleep(100);
			System.out.print("]");
			}
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}	
		
	public static void main(String[] args) {
			SyncDemo sd = new SyncDemo();
			
			Thread t1 = new Thread(sd, "Alfa");
			Thread t2 = new Thread(sd, "Beta");	
			Thread t3 = new Thread(sd, "Gama");
			
			t1.start();
			t2.start();
			t3.start();
	}
}
