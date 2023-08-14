class MyThread extends Thread{

	MyThread(ThreadGroup g , String name){
		super(g,name);
	}
	public void run(){
		System.out.println("child thread");

		try{
			Thread.sleep(5000);
		}
		catch(InterruptedException e){
		}
	}
}
class ThreadDemo{
	public static void main(String[] args)throws InterruptedException{

		ThreadGroup pg = new ThreadGroup("parent thread");
		ThreadGroup cg = new ThreadGroup(pg,"child thread");

		MyThread t1 = new MyThread(pg,"childthread1");
		MyThread t2 = new MyThread(pg,"childthread2");
		t1.start();
		t2.start();

		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		pg.list();

		Thread.sleep(10000);
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		pg.list();
	}
}

