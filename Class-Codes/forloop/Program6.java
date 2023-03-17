class PrimeNumber{
	public static void main(String[] args){
		int N = 8;
		int count = 0;
		for(int i=1;i<=N;i++){
			if(N%i==0){
				count++;
			}
		}
		if(count == 2){
			System.out.println("Prime number");
		}
		else{
			System.out.println("Not a Prime number");
		}
	}
}
