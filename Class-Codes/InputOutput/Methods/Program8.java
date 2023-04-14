class Demo{
	public static void main(String[] args){
		Demo obj = new Demo();
	       obj.fun(10);
       	       obj.fun(10.5f);
	}
	void fun(int x){
		System.out.println("In fun");
		System.out.println(x);
	}
}

