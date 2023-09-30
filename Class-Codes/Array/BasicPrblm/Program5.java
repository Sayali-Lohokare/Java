import java.io.*;
class ReplaceZero{
	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter the number :");
		int n= Integer.parseInt(br.readLine());

		int arr[] = new int[n];

		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}

		//int output = arr[i];

		for(int i=0;i<arr.length;i++){
			if(arr[i]==0){
				arr[i]=5;
			}
			System.out.print(arr[i]);
			System.out.println();


		}

		//System.out.println(output);
	}
}
