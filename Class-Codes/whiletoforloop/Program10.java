class Palindrome{
	public static void main(String[] args){
		int n = 432;
		int rem = 0;
		int rev = 0;
		for(int i=n;i>0;rev=rev*10+rem){
			rem = i%10;
			i = i/10;
		}
		System.out.println(rev);
	}
}
