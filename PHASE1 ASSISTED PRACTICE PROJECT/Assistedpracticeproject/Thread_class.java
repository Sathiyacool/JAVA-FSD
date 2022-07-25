package Assistedpracticeproject1;

public class Thread_class extends Thread {
	public void run() {
		System.out.println("Thread Started");
	}
	public static void main(String[] args) {
		Thread_class t=new Thread_class();
		t.start();
		
	}

}
