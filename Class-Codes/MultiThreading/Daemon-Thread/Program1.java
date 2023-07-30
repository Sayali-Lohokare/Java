class MyThread extends Thread{
	
	
}
class Demo{
	public static void main(String[] args){

		System.out.println(Thread.currentThread().isDaemon());

		try{
		Thread.currentThread().setDaemon(true);

		}
		catch(IllegalThreadStateException ie){
			throw new IllegalStateException("yuppp");
			//System.out.println("got it");
		}

		//MyThread t = new MyThread();
		//System.out.println(t.isDaemon());
	
	}
}
