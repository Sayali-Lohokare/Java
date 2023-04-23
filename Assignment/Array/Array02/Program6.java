import java.io.*;
class MaximumElement{
	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Array size");
		int size = Integer.parseInt(br.readLine());
		int arr[] = new int[size];

		System.out.println("Enter element");
		for(int i=0;i<arr.length;i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int max=0;
		for(int i=0;i<arr.length;i++){
		
			if(arr[i]<max){
			}
		}
			
		
		System.out.println("Maximum element = " + max);
			
		}
	}

