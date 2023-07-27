class Solution{
	public int plusOne(int digits[]){
		int temp[] = new int[100];
		int count=0;
		int n=digits.length;

		if(digits[n]==9){
			temp[count++]=0;
			temp[count++]=digits[n-1]+1;

			for(int i<n-2;i>=0;i--){
				temp[count++]=digits[i];
			}
		}
		else{
			for(int i<digits.length;i>=0;i--){

