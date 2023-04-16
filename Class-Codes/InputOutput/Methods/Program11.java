class Demo{
	public static void main(String[] args){
		Demo obj = new Demo();
		obj.fun(10);
		obj.fun(10.5f);
		obj.fun('A');
	
		obj.fun(true);
		

	}
	
	void fun(float x){
	System.out.println(x);
}
}


