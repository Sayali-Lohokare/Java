class MyThread extends Thread{

	public void run(){
		System.out.println("no args run");
	}
	public void run(int i){
		System.out.println("int args run");
	}
}
class ThreadDemo{
	public static void main(String[] args){

		MyThread t = new MyThread();
		t.start();
	}
}
