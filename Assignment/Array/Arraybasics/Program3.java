import java.io.*;
class SmallestNumDemo{
	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Array Size");
		int size = Integer.parseInt(br.readLine());
		int arr[] = new int[size];

		System.out.println("Enter elements");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		int output=arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]<output){
				output=arr[i];
			}
		}
		System.out.println("Smallest number =" + output);
	}
}
