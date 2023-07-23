class MyThread extends Thread{

	public void run(){
		System.out.println("in child run method");
		System.out.println(Thread.currentThread().getName());
	}
	public void start(){
		System.out.println("in start");
		run();
	}
}
class ThreadDemo{
	public static void main(String[] args){

		MyThread t = new MyThread();
		t.start();
		//System.out.println(Thread.currentThread().getName());
	}
}
