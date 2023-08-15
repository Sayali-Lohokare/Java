class CustomerThread extends Thread{
	static Integer custId = 0;

	private static ThreadLocal t1 = new ThreadLocal(){
		protected Integer initialValue(){
			return ++custId;
		}
	};
	CustomerThread(String name){
		super(name);
	}
	public void run(){
		System.out.println(Thread.currentThread().getName()+"executing with customer id:" + t1.get());
	}
}
class ThreadLocalDemo{
	public static void main(String[] args){

		CustomerThread c1 = new CustomerThread("CustomerThread-1");
		CustomerThread c2 = new CustomerThread("CustomerThread-2");
		CustomerThread c3 = new CustomerThread("CustomerThread-3");
		CustomerThread c4 = new CustomerThread("CustomerThread-4");
		c1.start();
		c2.start();
		c3.start();
		c4.start();
	}
}
