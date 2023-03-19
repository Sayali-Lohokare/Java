class PerfectNumber{
	public static void main(String[] args){
		int N = 6;
		int sum = 0;
		for(int i=1;i<N;i++){
			if(6%i==0){
			sum = sum + i;
			}
		}
		if(sum == N){
			System.out.println("Perfect Number");
		}
		else{
			System.out.println("Not perfect number");
		}
	}
	}

