class Palindrome{
	public static void main(String[] args){
		int n = 2332;
		int rem = 0;
		int rev = 0;
		int temp = n;
		for(int i=n;i>0;rev=rev*10+rem){
			rem=i%10;
			i=i/10;
   System.out.println(i);
		}
		
		if(temp==rev){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("not palindrome");
		}
	}
}
