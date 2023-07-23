class MyThread extends Thread{

	public void run(){
		for(int i=0;i<3;i++){
			System.out.println("in child thread run");

			try{
				Thread.sleep(2000);
				throw new InterruptedException("caught");
			}
			catch(InterruptedException ie){
				System.out.println("finally caught");
			}
		}
	}
}
class ThreadDemo{
	public static void main(String[] args)throws InterruptedException{

		MyThread t = new MyThread();
		t.start();

		for(int i=0;i<3;i++){
			System.out.println("in main thread");

			/*try{
			Thread.sleep(2000);
		}
		catch(InterruptedException ie){
			System.out.println("ie caught");
		}*/
		}
	}
}


