class Reverse{
	public static void main(String[] args){
		int x = 2332;
		int reverse = 0;
		int remainder = 0;
		int temp = x;
		while(x>0){
			x = x%10;
			
			reverse = reverse*10+remainder;
			temp = reverse;
			x = x/10;
		
		System.out.println(reverse);
		}
	}
}
