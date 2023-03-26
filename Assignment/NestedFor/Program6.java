class NestedFor{
	public static void main(String[] args){
		for(int i=1;i<=3;i++){
			int num=9;
			for(int j=1;j<=3;j++){
				System.out.print(num+ " ");
				num=num-1;
			}
			System.out.println();
		}
	}
}
