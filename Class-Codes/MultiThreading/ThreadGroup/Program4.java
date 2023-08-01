class MyThread extends Thread{
	MyThread(ThreadGroup tg,String str){
		super(tg,str);
	}
	public void run(){
		System.out.println(Thread.currentThread());
		try{
			Thread.sleep(2000);
		}
		catch(InterruptedException ie){
			System.out.println(ie.toString());
		}
	}
}
class ThreadGroupDemo{
	public static void main(String[] args){
		//pthreadGP.setPriority(6);
		ThreadGroup pthreadGP = new ThreadGroup("India");
		//pthreadGP.setPriority(6);
		MyThread t1 = new MyThread(pthreadGP,"Maha");
		MyThread t2 = new MyThread(pthreadGP,"Goa");

		t1.setPriority(6);
		t1.start();
		t2.start();

		ThreadGroup cthreadGP = new ThreadGroup("Pakistan");
		MyThread t3 = new MyThread(cthreadGP,"Kavat");
		MyThread t4 = new MyThread(cthreadGP,"Lahore");

		t3.setPriority(6);
		t3.start();
		t4.start();

		t2.interrupt();
		System.out.println(pthreadGP.activeCount());
		System.out.println(pthreadGP.activeGroupCount());
	}
}

/*When t3.interrupt() is called, the thread t3 is currently in a sleeping state due to the Thread.sleep(2000); statement inside the run() method of the MyThread class. This means that t3 is paused for two seconds (2000 milliseconds) due to the sleep method call.

When t3.interrupt() is executed, the sleep method is interrupted, and an InterruptedException is thrown. The catch block in the run() method of MyThread handles this exception, and the code inside the catch block is executed.

In this specific case, the InterruptedException is caught, and the exception message is printed, which will output something like: java.lang.InterruptedException: sleep interrupted.

After handling the InterruptedException, the run() method of t3 completes execution, and the thread resumes from where it was interrupted.*/
