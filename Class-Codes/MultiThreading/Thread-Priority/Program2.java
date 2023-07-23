class MyThread extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().getPriority());
	}
}
class ThreadDemo{
	public static void main(String[] args){

		MyThread t = new MyThread();
		t.start();

		t.start();
	}
}
