class MyThread extends Thread{

	public void start(){
		super.start();
		System.out.println("in start");
	}
	public void run(){
		System.out.println("in run");
	}
}
class ThreadDemo{
	public static void main(String[] args){

		MyThread t = new MyThread();
		t.start();
		System.out.println("in main");
	}
}
