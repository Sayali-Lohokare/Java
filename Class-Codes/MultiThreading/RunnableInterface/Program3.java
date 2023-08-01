class MyThread implements Runnable{
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
class MyThreadDemo{
	public static void main(String[] args){

		ThreadGroup pthreadGP = new ThreadGroup("India");
		MyThread obj1 = new MyThread();
		MyThread obj2 = new MyThread();

		Thread t1 = new Thread(pthreadGP,obj1,"Maha");
		Thread t2 = new Thread(pthreadGP,obj2,"Goa");
		t1.start();
		t2.start();
	}
}



