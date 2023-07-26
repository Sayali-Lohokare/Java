class MyThread extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().getName());
	}
}
class ThreadDemo{
	public static void main(String[] args)throws InterruptedException{

		System.out.println(Thread.currentThread().getName());

		MyThread t = new MyThread();
		t.start();

		Thread.sleep(1000);

		Thread.currentThread().setName("c2W");
		System.out.println(Thread.currentThread().getName());
	}
}

