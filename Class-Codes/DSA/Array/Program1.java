//print all elements from the array


import java.io.*;
class PrintEle{


	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter the elements");
		int n = Integer.parseInt(br.readLine());

		int arr[] = new int[n];

		for(int i=0;i<n;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		 

		for(int i=0;i<arr.length;i++){
			//System.out.println(arr[i]);
		}
	}
}

// TC = O(N)
// SC = O(1)
//
