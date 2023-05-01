class Demo{
	public static void main(String[] args){

		int arr[][] = {{10,20,30},{40,50},{60}};

		for(int oneA[] : arr){
			for(int x : oneA){
				System.out.println(x);
			}
		}
	}
}
