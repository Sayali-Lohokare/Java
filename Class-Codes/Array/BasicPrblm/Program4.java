/*import java.io.*;
class ProductDemo{
	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter the no of element:");
		int n = Integer.parseInt(br.readLine());

		System.out.println("enter the elements:");
		int arr[] = new int[n];

		for(int i=0;i<arr.length;i++){
		arr[i]=Integer.parseInt(br.readLine());
		}

		int product = 1;

		for(int i=0;i<arr.length;i++){
			product = product*arr[i];
		}
		//return product;

		System.out.println(product);
	}
}*/

import java.io.*;
class ProductDemo{

	static int find(int arr[]){

		int product = 1;

		for(int i=0;i<arr.length;i++){
			product = product*arr[i];
		}
		return product;
	}
	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter the no of elements in array");
		int n = Integer.parseInt(br.readLine());

		System.out.println("enter the elements :");
		int arr[] = new int[5];

		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}

		int output = find(arr);

		System.out.println("product of array is :" + output);
	}
}
