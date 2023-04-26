import java.io.*;
class OddIndex{
	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Array size");
		int size = Integer.parseInt(br.readLine());
		int arr[] = new int[size];

		

		System.out.println("Enter elements");
	
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		int sum=1;
		
		for(int i=0;i<arr.length;i++){
			if(i%2!=0){
			sum = sum*arr[i];
		}
		}
	
	System.out.println("product of odd index = " + sum);
	}
}

	
