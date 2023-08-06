class Demo{

	int fun(int a, int b){

	int c =2;
	b = b%c;
	a = a%c;

	return (a+b);
	}


	public static void main(String[] args){

		int a = 9;
		int b = 7;

		Demo obj = new Demo();
		obj.fun(a,b);

		System.out.println(a+c);
	}
}
