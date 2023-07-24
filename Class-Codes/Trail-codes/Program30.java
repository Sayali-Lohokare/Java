class MyThread extends Thread{

	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("Sayali");
		}
		try{
			Thread.sleep(20000);
		}
		catch(InterruptedException ie){

		}

	}
}
class ThreadDemo{
	public static void main(String[] args)throws InterruptedException{

		MyThread t = new MyThread();
		t.start();
		t.join(10000);

		for(int i=0;i<5;i++){
			System.out.println("Lohokare");
		}
	}
}
