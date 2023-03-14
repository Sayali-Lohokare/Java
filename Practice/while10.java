class Palindrome{
	public static void main(String[] args){
		int N = 6531;
		int remainder = 0;
		int reverse = 0;

		while(N > 0){
			remainder = N%10;
			N = N/10;
			reverse = (reverse * 10)+remainder;
		}
		System.out.println("N");
	}
}
