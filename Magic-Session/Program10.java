class Palindrome{
	public static void main(String[] args){
		int x = 2332;
		int reverse = 0;
		int rem = 0;
		int temp = x;
		while(x>0){
			x = x%10;
			x = x/10;
			reverse = reverse*10+rem;
			temp = reverse;
			if(temp==reverse){
				System.out.println("its a palindrome");
			}
			else{
				System.out.println("its not a palindrome");
			}
		}
	}
}
