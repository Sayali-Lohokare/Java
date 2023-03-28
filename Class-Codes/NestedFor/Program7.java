class NestedFor{
	public static void main(String[] args){
		int num=3;
		for(int i=1;i<=3;i++){
			for(int j=1;j<=3;j++){
				System.out.print(num+ " ");
			}
			System.out.println();
			num++;
		}
	}
}
