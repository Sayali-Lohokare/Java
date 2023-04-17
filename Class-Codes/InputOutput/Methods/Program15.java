class Demo{
	void fun(int x){
		int y = x+10;
	}
	public static void main(String[] args){
		Demo obj = new Demo();
		int a = obj.fun(10);
		System.out.println(a);
	}
}
