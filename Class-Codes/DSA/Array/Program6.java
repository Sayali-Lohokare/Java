/* count no of element having atleast one element greater  than itself
 */

/*class CountElementsGreaterThanItself{

	public static void main(String[] args){

		int arr[] = new int[] {2,5,1,4,8,0,8,1,3,8};

		int count = 0;

		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]<arr[j]){
					count ++;
					break;
				}
				//System.out.println(count);
			}
		}
		System.out.println(count);
	}
}*/
// TC - O(N^2)


//optimized approach


class CountElementGreaterThanITself{
	public static void main(String[] args){

		int arr[] = new int[]{2,5,1,4,8,0,8,1,3,8};
		int N = 10;
		int max = Integer.MIN_VALUE;
		

		for(int i=0;i<N;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}

		//count

		int count = 0;

		for(int i=0;i<N;i++){
			if(arr[i]==max){
				count++;
			}
			System.out.println(N-count);
		}
	}
}
