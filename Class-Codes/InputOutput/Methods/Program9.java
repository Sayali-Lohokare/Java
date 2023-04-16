class Demo{
	public static void main(String[] rgs){
		Demo obj = new Demo();
		obj.fun(10.5f);
		obj.fun(10);
	
		
	}
	void fun(float x){
		System.out.println("in fun");
		System.out.println(x);
	}
}
