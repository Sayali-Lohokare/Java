class MyThread extends Thread{

	public void run(){
		for(int i=0;i<5;i++){
			System.out.println("Sayali");
		}
		try{
			Thread.sleep(3000);
		}
		catch(InterruptedException ie){

		}

	}
}
class ThreadDemo{
	public static void main(String[] args)throws InterruptedException{

		MyThread t = new MyThread();
		t.start();
		t.join();

		for(int i=0;i<5;i++){
			System.out.println("Lohokare");
		}
	}
}
