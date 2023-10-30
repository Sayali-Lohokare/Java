class RecursionDemo{

	int fun(int n){

		if(n==0){
			return 1;
		}
		return 5 + fun(--n);
	}

	public static void main(String[] args){

		int n = 2;

		System.out.println("start");

		RecursionDemo obj = new RecursionDemo();
		int ret = obj.fun(n);
		System.out.println(ret);
		System.out.println("end");
	}
}
