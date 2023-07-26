class MyThread extends Thread{

	public void run(){
		System.out.println(Thread.currentThread().getName());
	}
}
class ThreadDemo{
	public static void main(String[] args){

		MyThread t = new MyThread();
		t.start();
		//t.yield();

		System.out.println(Thread.currentThread().getName());
	}
}
