class A{
	public  void d1(B b){
		System.out.println("thread1 starts execution of d1() method");
		try{
			Thread.sleep(3000);
		}
		catch(InterruptedException ie){
		}
		System.out.println("thread1 trying to call B's last() method");
		b.last();
	}
	public synchronized void last(){
		System.out.println("inside A, this is the last() method");
	}
}
class B{
	public  void d2(A a){
		System.out.println("thread2 starts exceution of d2() method");
		try{
			Thread.sleep(3000);
		}
		catch(InterruptedException ie){
		}
		System.out.println("thread2 trying to call A's last() method");
		a.last();
	}
	public synchronized void last(){
		System.out.println("inside B,this is last() method");
	}
}
class DeadLock1 extends Thread{
	A a = new A();
	B b = new B();

	public void m1(){
		this.start();
		//d.start();
		a.d1(b);
	}
	public void run(){
		b.d2(a);
	}
	public static void main(String[] args){

		DeadLock1 d = new DeadLock1();
		d.m1();
	}
}


