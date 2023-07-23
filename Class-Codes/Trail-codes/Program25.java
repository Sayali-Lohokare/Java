class MyThread extends Thread{

	public void run(){

	System.out.println("this line is executed by " + Thread.currentThread().getName());
	}
}
class ThreadDemo{
	public static void main(String[] args){

		System.out.println(Thread.currentThread().getName());
		MyThread t = new MyThread();
		t.start();
		System.out.println(t.getName());
		Thread.currentThread().setName("xyz");
		System.out.println(Thread.currentThread().getName());
		t.setName("abs");
		System.out.println(t.getName());
		//System.out.println(10/0);
		System.out.println("this line is executed by " + Thread.currentThread().getName());
	}
}
