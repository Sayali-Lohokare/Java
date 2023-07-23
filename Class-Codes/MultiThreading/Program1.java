class MyThread extends Thread{

	public void run(){
		for(int i=0;i<3;i++){
			System.out.println("in child method run");
		}
	}
}
class ThreadDemo{
	public static void main(String[] args){

		MyThread t = new MyThread();
		t.start();

		for(int i=0;i<3;i++){
			System.out.println("in main thread");
		}
	}
}
