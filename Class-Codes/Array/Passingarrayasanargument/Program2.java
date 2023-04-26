class Demo{
	public static void main(String[] args){
		FunDemo obj = new FunDemo();
		int ret = obj.fun(int x=10);
		System.out.println(ret);
	}
	int fun(int x){
		int val = x+50;
		return val;
	}
}
