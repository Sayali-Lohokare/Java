class MyThread extends Thread{
	MyThread(ThreadGroup tg,String str){
		super(tg,str);
	}
	public void run(){
		System.out.println(Thread.currentThread());
		try{
			Thread.sleep(2000);
		}
		catch(InterruptedException ie){
			System.out.println(ie.toString());
		}
	}
}
class ThreadGroupDemo{
	public static void main(String[] args){
		//pthreadGP.setPriority(6);
		ThreadGroup pthreadGP = new ThreadGroup("India");
		//pthreadGP.setPriority(6);
		MyThread t1 = new MyThread(pthreadGP,"Maha");
		MyThread t2 = new MyThread(pthreadGP,"Goa");

		t1.setPriority(6);
		t1.start();
		t2.start();

		ThreadGroup cthreadGP = new ThreadGroup("Pakistan");
		cthreadGP.setPriority(8);
		MyThread t3 = new MyThread(cthreadGP,"Kavat");
		MyThread t4 = new MyThread(cthreadGP,"Lahore");

		t3.start();
		t4.start();

		cthreadGP.interrupt();
		System.out.println(pthreadGP.activeCount());
		System.out.println(pthreadGP.activeGroupCount());
	}
}


