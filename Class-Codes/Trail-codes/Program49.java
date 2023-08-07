class RatFood{

	static int minHouseNeeded(int r,int units,int arr[]){

		if(arr == null){
			return -1;
		}

		int totalFoodNeeded = r*units;
		int totalHouseReq = 0;
		int housesChecked = 0;


		for(int i=0;i<arr.length;i++){
			totalHouseReq = totalHouseReq+arr[i];
			housesChecked++;

			if(totalHouseReq>totalFoodNeeded){
				break;
			}
		}
		if(totalHouseReq<totalFoodNeeded){
			return 0;
		}
		return housesChecked;
	}
	public static void main(String[] args){

		int r =7;
		int units = 2;
		int arr[] = {2,8,3,5,7,4,1,2};

		int output = minHouseNeeded(r,units,arr);
		System.out.println("No of houses requered = "+output);
	}
}
