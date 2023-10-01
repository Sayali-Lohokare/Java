import java.io.*;
class ReverseDemo{
	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Array size");
		int size = Integer.parseInt(br.readLine());
		int arr[] = new int[size];

		System.out.println("Enter elements");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Reverse elements:");
		for(int i=arr.length-1;i>=0;i--){
			System.out.println(arr[i]+" ");
		}
		
	}
}
