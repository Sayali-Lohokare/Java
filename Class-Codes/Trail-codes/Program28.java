class MyThread extends Thread{
	 public void run(){

		 //Thread.currentThread().getPriority();
		 for(int i = 0;i<3;i++){
			
			System.out.println("child thread");
		 }
	 }
}
class ThreadPrioDemo{
	public static void main(String[] args){

		MyThread t = new MyThread();
		t.setPriority(10);
		t.start();
		
		for(int i=0;i<3;i++){
			System.out.println("in main thread");
		}
	}
}

