interface Demo{

	public void fun(){
		System.out.println("in fun");

	}
}
class Child implements Demo{
	public static void main(String[] args){

		Demo obj = new Demo();
		obj.fun();
	}
}
