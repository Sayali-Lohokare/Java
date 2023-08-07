class Demo{
	static int differenceofSum(int n,int m){

		int sumDivisible = 0;
		int sumNotDivisible = 0;
		//int diff = 0;


		for(int i=1;i<=m;i++){
			if(i%n==0){
				sumDivisible = sumDivisible+i;
			}
			else{
				sumNotDivisible = sumNotDivisible+i;
			}
		}
		return sumNotDivisible - sumDivisible;
	}
	public static void main(String[] args){
		int n = 4;
		int m = 20;

		int output = differenceofSum(n,m);
		System.out.println("output: " + output);
	}
}
