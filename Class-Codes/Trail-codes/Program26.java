class MyThread extends Thread{

}
class ThreadDemo{
	public static void main(String[] args){

		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(8);
		System.out.println(Thread.currentThread().getPriority());
		MyThread t = new MyThread();
		System.out.println(t.getPriority());

	}
}
