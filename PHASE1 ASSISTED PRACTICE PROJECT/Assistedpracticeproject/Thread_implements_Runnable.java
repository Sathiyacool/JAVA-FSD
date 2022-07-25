package Assistedpracticeproject1;

public class Thread_implements_Runnable implements Runnable {
	@Override
	public void run() {

		System.out.println("Thread started");

	}

	public static void main(String[] args) {
		System.out.println("Main started");
		Thread t1 = new Thread(new Thread_implements_Runnable());
		//Thread_implements_Runnable t = new Thread_implements_Runnable();
		//Thread t1 = new Thread(t);
		t1.start();
		System.out.println("End of the Thread");

	}

}
