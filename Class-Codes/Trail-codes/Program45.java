class MyThread extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("child thread");
		}
		System.out.println("i want to sleep");

		try{
			Thread.sleep(3000);
		}
		catch(InterruptedException ie){
			System.out.println("i got Interrupted");
		}
	}
}
class ThreadDemo{
	public static void main(String[] args){

		MyThread t = new MyThread();
		t.start();

		t.interrupt();
		System.out.println("main thread");
	}
}
