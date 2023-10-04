//count no of elements having atleast 1 element greater than itself


/*class Element{
	public static void main(String[] args){

		int n = 10;

		int arr[] = new int[]{2,5,1,4,8,0,8,1,3,8};

		int count = 0;

		for(int i=0;i<n;i++){

			for(int j=i+1;j<n;j++){

				if(arr[i]<arr[j]){

					count++;
					break;
				}
				//System.out.println(count);
			}
			//System.out.println(count);
		}
		System.out.println(count);
	}
}*/



class Element{
	public static void main(String[] args){

		int n = 10;
		int arr[] = new int[]{2,5,1,4,8,0,8,1,3,8};
		int count=0;
		int maxi = Integer.MIN_VALUE;

		for(int i=0;i<n;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		for(int i=0;i<n;i++){
			if(arr[i]==max){
				count++;
			}
			System.out.println(n-count);
		}
	}
}

