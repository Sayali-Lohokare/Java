class NestedFor{
	public static void main(String[] args){
		int N=4;
		char ch='d';
		for(int i=1;i<=N;i++){
		
			for(int j=1;j<=N;j++){
				System.out.print(ch+ " ");
				
			}
			System.out.println();
			ch--;
		}
	}
}
