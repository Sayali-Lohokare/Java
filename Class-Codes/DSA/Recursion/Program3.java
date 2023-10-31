class SumNaturalNum{

	int result(int n){

		//int sum = 0;

		if(n==1){
			return 1;
		}
		return n + result(--n);
	}

	public static void main(String[] args){

		int n = 10;

		SumNaturalNum obj = new SumNaturalNum();
		int ret = obj.result(n);
		System.out.println(ret);
	}
}
	
