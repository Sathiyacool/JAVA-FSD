package Assistedpracticeproject1;

/*class MyOwnThread1 extends Thread{
	public void run(){
		
		for(int count=1; count<=3;count++){
			System.out.println("Hello All!!!");
			try {
				Thread.sleep(3000);// sleep is static method 
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	
	}

}
public class Thread_SleepWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			MyOwnThread1 obj=new MyOwnThread1();
			obj.start();
	}

}*/
public class  Thread_SleepWait 
{
    private static Object obj = new Object();
    public static void main(String args[]) throws InterruptedException
    {
        Thread.sleep(2000);
        System.out.println("Thread '" + Thread.currentThread().getName() + "' is woken after sleeping for 2 second");
        synchronized (obj) 
        {
            obj.wait(4000);
            System.out.println("Object '" + obj + "' is woken after" + " waiting for 4 second");
        }
    }
}



