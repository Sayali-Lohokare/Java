/*import java.io.*;
class FindLargestElement{
	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter the no of elements");
		int n = Integer.parseInt(br.readLine());

		System.out.println("enter the elements");
		int arr[] = new int[n];

		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}

		int largestno = arr[0];

		for(int i=1;i<arr.length;i++){
			if(arr[i]>largestno){
				largestno = arr[i];
			}
		}
		System.out.println("the largest element is:" + largestno );
	}
}*/


import java.io.*;
class FindLargestElement{
	static int Find(int arr[]){

		int largestno = 0;
		for(int i=1;i<arr.length;i++){
			if(arr[i]>largestno){
				largestno = arr[i];
			}
		}
		return largestno;
	}
	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter no");
		int n = Integer.parseInt(br.readLine());

		System.out.println("enter elements");
		int arr[] = new int[n];

		for(int i=0;i<arr.length;i++){

			arr[i]=Integer.parseInt(br.readLine());
		}



		int no = Find(arr);

		System.out.println("largest element is:" + no);
	}
}

