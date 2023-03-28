class NestedFor{
	public static void main(String[] args){
		for(int i=1;i<=6;i++){
			int x=6;
			char ch='F';
			for(int j=1;j<=6;j++){
				if(j%2==0){
					System.out.print(x+" ");
					
				}
				else{
					System.out.print(ch+" ");
				}
				x--;
				ch--;
			}
			System.out.println();
		}
	}
}
