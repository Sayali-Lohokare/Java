// by default priority of threadgroup is 10
//
//
class MyThread extends Thread{

	MyThread(String str){
		super(str);
	}

	public void run(){
		System.out.println(getName());
		System.out.println(Thread.currentThread());
	}
}
class ThreadDemo{
	public static void main(String[] args){

		MyThread t = new MyThread("xyz");
		t.start();
	}
}
		
