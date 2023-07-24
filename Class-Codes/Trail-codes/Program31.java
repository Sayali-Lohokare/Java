class MyThread extends Thread{

	public void run(){
		try{
			for(int i=0;i<10;i++){
				System.out.println("i am a lazy thread:"+i);
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException ie){
			System.out.println("i got interrupted");
		}
	}
}
class ThreadDemo{
	public static void main(String[] args){
		MyThread t = new MyThread();
		t.start();
		//t.interrupt();
		System.out.println("end main thread");
	}
}

