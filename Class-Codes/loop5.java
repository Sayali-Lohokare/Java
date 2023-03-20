class Palindrome{
	public static void main(String[] args){
		int n = 2332;
		int rem = 0;
		int rev = 0;
		int temp = n;
		while(n!=0){
			rem = n%10;
			n = n/10;
			rev = rev*10+rem;
			
			
		}
		if(temp==rev){
			System.out.println("palindrome");
		}
		else{
			System.out.println("not palindrome");
		}
	}
}
