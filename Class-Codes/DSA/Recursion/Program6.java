class SumOfN{
/*
	int fun(int n){
		int sum=0;

		for(int i=0;i<=n;i++){
			sum=sum+i;
		}
		return sum;
	}


	public static void main(String[] args){

		int n = 5;

		SumOfN obj = new SumOfN();
		int ret = obj.fun(n);
		System.out.println(ret);
	}
}*/


/*
	int sum=0;
	int fun(int n){
		if(n==0){
			return 0;
		}
		sum=sum+n;
		fun(--n);
		return sum;
	}*/

	int fun(int n ){
		if(n==0){
			return 0;
		}
		return n + fun(--n);
	}

	public static void main(String[] args){

		int n=5;

		SumOfN obj = new SumOfN();
		int ret = obj.fun(n);
		System.out.println(ret);
	}
}


