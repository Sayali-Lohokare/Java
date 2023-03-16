class Square{
	public static void main(String[] args){
		int num = 942111432;
		int digit = 0;
		int square = 1;

		while(num > 0){
	            digit = num % 10;
		    num = num/10;
			
		}
			if(digit%2==0){
				square = digit*digit;
				System.out.println(square + " ");
				
			}
	}
}


