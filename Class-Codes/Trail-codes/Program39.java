//bubblesort


class Demo{
	public static void  bubbleSort(int arr[]){
		int temp=0;

		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	
	public static void  newArr(int arr[]){
		for(int a=0;a<arr.length;a++){
			System.out.print(arr[a]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args){
		int arr[]={3,6,2,1,8,7,4,5,3,1};
		bubbleSort(arr);
		newArr(arr);
	}
}

