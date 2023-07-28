class MyThread extends Thread{
	static Thread mt;

	public void run(){
		try{
			mt.join();
		}
		catch(InterruptedException ie){
			//System.out.println("Child thread");
		}
		for(int i=0;i<5;i++){
			System.out.println("child thread");
		}
	}
}
class ThreadJoinDemo{
	public static void main(String[] args)throws InterruptedException{

		MyThread.mt =  Thread.currentThread();

		MyThread t = new MyThread();
		t.start();
		t.join();

		for(int i=0;i<5;i++){
			System.out.println("main thread");
			Thread.sleep(2000);
		}
	}
}

