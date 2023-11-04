class NaturalNum{

	static void find(int n){

		if(n<1){
			//find(n-1);
			System.out.println(n);
		
		}
		else{
			System.out.println(n);
			find(n-1);
		}


	}

	public static void main(String[] args){

		int n =10;

		NaturalNum obj = new NaturalNum();
		obj.find(n);
	//	find(n);
	}
}
