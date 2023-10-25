class LeftMax{
	public static void main(String[] args){

		int arr[] = new int[]{-3,6,2,4,5,2,8,-9,3,1};
		int leftMax[] = new int[] {-3,6,6,6,6,6,8,8,8,8};

		for(int i=0;i<arr.length;i++){

			int max = Integer.MIN_VALUE;

			for(int j=0;j<=i;j++){
				if(arr[i]>max){
					max=arr[i];
				}
			}
			leftMax[i]=max;
			
		}

		for(int i=0;i<arr.length;i++){

			System.out.println(leftMax[i] + " ");
		}
	}
}
