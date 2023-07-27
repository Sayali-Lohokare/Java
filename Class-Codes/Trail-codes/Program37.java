/*class Demo{
		public static void bubbleSort(int arr[]){
			int temp=0;

			for(int turn=0;turn<arr.length-1;turn++){
				for(int j=0;j<arr.length-1-turn;j++){
					if(arr[j]>arr[j+1]){
						temp = arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
				}
			}
		}
		public static void printArr(int arr[]){
			for(int i=0;i<arr.length;i++){
				System.out.print(arr[i]+ " ");
			}
			System.out.println();
		}
	public static void main(String[] args){

		int arr[] = {5,3,2,1,4};
		bubbleSort(arr);
		printArr(arr);
	}
}*/

class Solution {
    public static int[] plusOne(int[] digits) {

        int temp[] = new int[100];
        int count =0;
        int n = digits.length;
        if (digits[n]==9){
            temp [count++]=0;
            temp[count++]=digits[n-1]+1;
            for (int i = n-2-1;i>=0;i--){
                temp[count++]=digits[i];
            }
        }
        else{
		temp[count++]=digits[n-1]+1;
        for (int i =n-2;i>=0;i--){
            temp[count++]=digits[i]; 

           
        }
	}
        int temp1[] = new int [count+1];
        for (int i=0;i<count+1;i++){
            temp1[i]=temp[i];

        
	}
	
        int start = 0;
        int end = count+1;
        while(start<end){
            int t = temp1[start];
            temp1[start]= temp1[end];
            temp1[end]= temp1[start];

        }
        return temp1;

        
    }
    public static void main(String[] args){
	    int digits[] = {1,2,3,4,5,9};
	    int arr[] = plusOne(digits);
	    for (int i=0;i<arr.length;i++){
	    System.out.print(arr[i] +" ");
	    }
    }

    }





