class Break{
	public static void main(String[] args){
		int N = 15;
		int count = 0;
		for(int i=N;i<=15;i++){
			if(N%i==0){
				count++;
				
				
			}
		
		
			if(count>2){
				
				
				break;
			}
		}
		if(count==2){
			System.out.println("prime number");
		}
		else{
			System.out.println("number is not prime");
		}
	}
}


