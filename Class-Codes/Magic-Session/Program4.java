class Square{
	public static void main(String[] args){
		int num = 942111432;
		int rem = 0;
		while(num>0){
			rem = num%10;
			if(rem%2==0){
				System.out.println(rem*rem);
				rem = num/10;
				
			}
			
				
			
		}
	}
}


