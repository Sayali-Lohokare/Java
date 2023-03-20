class Reverse{
	public static void main(String[] args){

		int num = 942111423;
		int reverse = 0;
		int rem = 0;
		int temp = num;
		while(num > 0){
			num = num % 10;
			num = num/10;
			reverse = reverse * 10 + rem;
			temp = reverse;
			
		}
		System.out.println(reverse);
	}
}
