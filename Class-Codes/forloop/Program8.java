class Armstrong{
	public static void main(String[] args){
		int N = 153;
		int rem =0;
		int sum = 0;
		int temp = N;
		for(int i = N;N>0;N=N/10){
			rem = N%10;
			sum = sum + (rem*rem*rem);
		}
		if(sum == temp){
			System.out.println(sum  +  " is an Armstrong number ");
		}
		else{
			System.out.println(sum + "is not an Armstrong number");
		}
	}
}

