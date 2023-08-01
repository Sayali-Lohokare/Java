import java.util.concurrent.*;
class Mythread implements Runnable{
	int num;
	MyThread (int num){
		this.num=num;
	}
	public void run(){
		System.out.println(Thread.currentThread()+ "start :" + num);
		}
	void daily(ask){
		try{
			Thread.sleep(2000);
		}
		catch(InterruptedException ie){
		}
	}
}
class ThreadDemo{
	public static void main(String[] args){

		ExecutorService ser = new FixedPoolThreadPool();

		for(int i=1;i<=5;i++){
			MyThread t = new MyThread(i);
			ser.execute(obj);
		}
		ser.shutdown();
	}
}
