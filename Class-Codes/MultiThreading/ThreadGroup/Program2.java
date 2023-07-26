class MyThread extends Thread{

	MyThread(ThreadGroup tg, String str){

		super(tg,str);
	}
	public void run(){
		System.out.println(Thread.currentThread());
	}
}
class ThreadDemo{
	public static void main(String[] args){

		ThreadGroup pthreadGP = new ThreadGroup("c2w");

		MyThread t = new MyThread(pthreadGP,"c");
		t.start();
	}
}
