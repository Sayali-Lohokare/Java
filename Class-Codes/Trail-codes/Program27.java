class MyThread extends Thread{

	public void run(){

		for(int i=0;i<5;i++){
			System.out.println("child thread");
		}
	}
}
class ThreadDemo{
	public static void main(String[] args){

		Thread.currentThread().setPriority(9);
		MyThread t = new MyThread();
		t.setPriority(8);
		t.start();
		System.out.println("main thread");
	}
}
