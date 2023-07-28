class MyThread extends Thread{
	public void run(){
		try{
			t.join();
		}
		catch(InterruptedException ie){
		}
		for(int i=0;i<5;i++){
			System.out.println("child thread");
		}
	}
}
class ThreadJoinDemo{
	public static void main(String[] args)throws InterruptedException{

		MyThread t = new MyThread();
		t.start();
		t.join();

		for(int i=0;i<5;i++){
			System.out.println("main thread");
			Thread.sleep(2000);
		}
	}
}
