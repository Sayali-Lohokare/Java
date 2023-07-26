class MyThread extends Thread{
	public void run(){
		for(int i=0;i<5;i++){
		System.out.println("in thread child");
		}
	}
}
class ThreadDemo{
	public static void main(String[] args)throws InterruptedException{

		MyThread t = new MyThread();
		t.start();

		//t.join();

		for(int i=0;i<5;i++){
			System.out.println("in main");
		}
	}
}
