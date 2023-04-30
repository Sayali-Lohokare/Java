class Demo{
	public static void main(String[] args){

		int arr[][] = new int[3][2];

		arr[0][0] = 5;
		arr[0][1] = 10;
		arr[1][0] = 15;
		arr[1][1] = 20;
		arr[2][0] = 25;
		arr[2][1] = 30;

		for(int i=0;i<3;i++){
			for(int j=0;j<2;j++){
			System.out.println(arr[i][j]);
			}
		}
	}
}

