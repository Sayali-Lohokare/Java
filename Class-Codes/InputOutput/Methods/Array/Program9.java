import java.io.*;
import java.util.*;
class Demo{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[]=new int[5];
		int sum=0;
		System.out.println("Enter elements");
		for(int i=0;i<5;i++){
		arr[i]=Integer.parseInt(br.readLine());
		
		sum=sum+arr[i];
		}
		
		System.out.println("Array sum =" + sum);
		}
	}


