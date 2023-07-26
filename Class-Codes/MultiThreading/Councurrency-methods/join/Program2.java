// deadlock condition


class MyThread extends Thread{
	static Thread nmMain = null;
	public void run(){
		try{
			nmMain.join();
		}
		catch(InterruptedException ie){

		}
		for(int i=0;i<5;i++){
			System.out.println("in thread-0");
		}
	}
}
class ThreadDemo{
	public static void main(String[] args)throws InterruptedException{
		MyThread nmMain = Thread.currentThread();
		MyThread t = new MyThread();
		t.start();
		t.join();

		for(int i=0;i<5;i++){
			System.out.println("in main");
		}
	}
}


