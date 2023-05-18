import java.io.*;
class SecondLargestNumDemo{
	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Array size");
		int size = Integer.parseInt(br.readLine());
		int arr[] = new int[size];

		System.out.println("Enter array elements");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		int largestnum=0;
		int secondlargestnum=0;

		for(int i=0;i<arr.length;i++){
			if(arr[i]>largestnum){
				secondlargestnum = largestnum;
				largestnum = arr[i];
			}
			else if(arr[i]>secondlargestnum){
				secondlargestnum=arr[i];
			}
		}
		System.out.println("second largest num ="+ secondlargestnum);
	}
}
