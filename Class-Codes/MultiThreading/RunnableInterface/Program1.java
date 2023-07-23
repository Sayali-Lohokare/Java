class MyRunnable implements Runnable{
	public void run(){
		System.out.println("in run");
		System.out.println(Thread.currentThread().getName());
	}
}
class ThreadDemo{
	public static void main(String[] args){

		MyRunnable r = new MyRunnable();
		Thread t = new Thread(r);
		t.start();
		System.out.println("in main");
	}
}
