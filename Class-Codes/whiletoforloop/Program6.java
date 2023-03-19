class Numbers{
	public static void main(String[] args){
		int sum = 0;
		int mul = 1;
		for(int i=1;i<=10;i++){
			if(i%2==0){
			sum = sum + i;
		}
		else{
			mul = mul*i;
		}
		}
	System.out.println(sum);
	System.out.println(mul);
	}
}

