// Sum of digit

class SumOfDigits{

	int fun(int n){

		if(n==0){
			return 0;
		}

		return n%10 + fun(n/10);
	}

	public static void main(String[] atgs){

		int n = 123;

		SumOfDigits obj = new SumOfDigits();
		int ret = obj.fun(n);
		System.out.println(ret);
	}
}
	
