class NestedFor{
	public static void main(String[] args){
		int num=4;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				System.out.print(num+ "  ");
			}
			System.out.println();
			num++;
		}
	}
}
