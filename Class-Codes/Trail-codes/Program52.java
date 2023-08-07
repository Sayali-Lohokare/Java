class ElementCounter{
	static int findCount(int arr[],int length,int num,int diff){
		int count = 0;

		for(int i=0;i<length;i++){
			int absoluteDiff = arr[i]-num;

			if(absoluteDiff<0){
				absoluteDiff = (absoluteDiff<0)? -absoluteDiff : absoluteDiff;
				//absoluteDiff = -absoluteDiff;
			}
			if(absoluteDiff<=diff){
				count++;
			}
		}
		if(count==0){
			return -1;
		}
		return count;
	}
	public static void main(String[] args){
		int arr[] = {12,3,14,56,77,13};
		int num = 13;
		int diff = 2;

		int output = findCount(arr,arr.length,num,diff);
		System.out.println("output: " + output);
	}
}


