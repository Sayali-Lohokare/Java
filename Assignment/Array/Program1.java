import java.io.*;
class Demo{
	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Array Size");
		int size = Integer.parseInt(br.readLine());
		int arr[] = new int[size];

		System.out.println("Enter elements");
		for(int i = 0;i<5;i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
		int sum = 0;
		for(int i = 0;i<5;i++){
			if(i%2!=0){
				sum = sum+arr[i];
			}
		}
			System.out.println("Sum of odd elements =" + sum);
		
	}
}
