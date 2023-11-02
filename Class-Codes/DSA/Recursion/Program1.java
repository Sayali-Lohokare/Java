class PrintNum{


	void find(int n){

		if(n==10){
			System.out.println(n);
		}
		else{
			System.out.println(n);
			find(n+1);
		}
	}

		
		public static void main(String[] args){

		PrintNum obj = new PrintNum();
		obj.find(1);
	}
}
	

