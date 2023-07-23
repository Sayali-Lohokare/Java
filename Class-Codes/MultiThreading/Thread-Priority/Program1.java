class MyThread extends Thread{
	public void run(){
		Thread t = Thread.currentThread();
		System.out.println(t.getPriority());
	}
}
class ThreadDemo{
	public static void main(String[] args){

		Thread t = Thread.currentThread();
		System.out.println(t.getPriority());

		MyThread t1 = new MyThread();
		//t1.start();

		t1.setPriority(7);
		t1.start();

		MyThread t2 = new MyThread();
		t2.start();
	}
}










