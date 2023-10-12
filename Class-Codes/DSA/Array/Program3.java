// two sums

import java.io.*;
import java.util.Arrays;
class TwoSum{

	public static int[] find(int arr[], int target){
		 
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]+arr[j]==target){
					return new int[] {i,j};
				}
			}
		}
		return new int[] {-1, -1 };
	}
	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		
		System.out.println("Enter Array no");
		int n = Integer.parseInt(br.readLine());

		System.out.println("enter array elements");



		int arr[] = new int[n];

		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());

			
		}

		System.out.println("enter target value");
		int target = Integer.parseInt(br.readLine());


		int output[] = find(arr,target);
		System.out.println(Arrays.toString(output));
	}
}

