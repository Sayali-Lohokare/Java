import java.io.*;
import java.util.*;
class Demo{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter five elements");
		int elements = Integer.parseInt(br.readLine());
		int arr[] = new int[5];
		for(int i = 0;i<5;i++){
			System.out.println(arr[i]+ " ");
		}
		for(int i =0;i<5;i++){
			System.out.println(arr[i]);
		
	}
}
}
