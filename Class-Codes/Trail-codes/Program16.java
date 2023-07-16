abstract class Parent{

	public abstract void m1();

	

	public abstract int m2();

	
}
abstract class Child extends Parent{

	public void m1(){
	}

}
class Child1 extends Child{
	//public static void main(String[] args){
	
	public int m2(){

		return 2;

	}
	}
class Client{
	public static void main(String[] args){

		Child obj = new Child1();
		//obj.m2();
		System.out.println(obj.m2());
	}
}
