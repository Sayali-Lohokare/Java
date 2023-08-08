class Demo{
	static int LargeSmallSum(int arr[]){

		//int sum = 0;

		if(arr.length==0){
			return 0;
		}
		if(arr.length<=3){
			return 0;
		}

		int secondLargestEven = arr[0];
		int secondSmallestOdd = arr[0];

		for(int i=0;i<arr.length;i++){
			if(i%2==0){
				if(arr[i]>secondLargestEven){
					secondLargestEven = arr[i];
				}
			}
			else{
				if(arr[i]<secondSmallestOdd){
					secondSmallestOdd = arr[i];
				}
			}
		}
			
			return secondLargestEven + secondSmallestOdd;
		}
	
	public static void main(String[] args){

		int arr[] = {3,2,1,7,5,4};
		int output = LargeSmallSum(arr);
		System.out.println("output:" + output);
	}
}
			
