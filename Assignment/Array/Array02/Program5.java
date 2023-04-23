import java.io.*;
class MinimumElement{
	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Array size");
		int size = Integer.parseInt(br.readLine());
		int arr[] = new int[size];

		System.out.println("Enter elements");
			for(int i=0;i<arr.length;i++){
				arr[i]=Integer.parseInt(br.readLine());
			}
		int min=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]<min){
			}
		}
		System.out.println("Minimun element = " + min);
	}
}

