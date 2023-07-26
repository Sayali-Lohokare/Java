class Demo{
	public static int searchInteger(int nums[], int target){

		int start = 0;
		int end = nums.length-1;

		while(start<=end){
			int mid = (start + end)/2;

			if(nums[mid]==target){
				return mid;
			}
			else if(nums[mid]<target){
				start = mid + 1;
			}
			else{
				end = mid-1;
			}
		}
		return start;
	}
		//System.out.println(start);	
	
	public static void main(String[] args){

	        int nums[] = {1,3,5,7};
		int target = 5;
		
		Demo obj = new Demo();

		int target1 = 5;
		int target2 = 7;
		int target3 = 2;

		int index1 = obj.searchInteger(nums, target1);
		System.out.println("Target" + target1 + "is found at index" + index1);

		int index2 = obj.searchInteger(nums, target2);
		System.out.println("Target" + target2 + "can be inserted at index" + index2);

		int index3 = obj.searchInteger(nums, target3);
		System.out.println("Target" + target3 + "can be inserted at index" + index3);


	}
}

		

