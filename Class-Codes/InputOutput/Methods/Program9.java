class Demo{
	public static void main(String[] rgs){
		//Demo obj = new Demo();
		//obj.fun(10.5f);
		float x = 10.5f;
		System.out.println("in main");
		System.out.println(x);
	}
	void fun(){
		//System.out.println("in fun");
		//System.out.println(x);
		Demo obj = new Demo();
		obj.fun();
	}
}
