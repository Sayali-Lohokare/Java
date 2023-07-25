class Demo{
	public static int removeNumbers(int nums,int val){

		int i=0;
		for(int j=0 ; j < nums.length ; j++){

			if(nums[j]!=val){
				nums[i]=nums[j];
				i++;
			}
		}
		for(int k=0;k<i;k++){
			System.out.print(nums[k] + " ");
		}
		System.out.pritnln();
		return i;
		//System.out.println(i);
	}
	public static void main(String[] args){

		int nums[] = {3,2,2,3};
		val=3;
		//System.out.println(i);
		int newLength = removeNumbers(int nums,int val);
		System.out.println("UpdatedLength: " + newLength);
	}
}
