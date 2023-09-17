import java.io.*;
class Demo{
	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Array size");
		int size = Integer.parseInt(br.readLine());
		int arr[] = new int[]{1,2,3,4,5,10,55,77,99};
		
		
			
			System.out.println("Enter elements");

		int sum=1;
		for(int i = 0;i<9;i++){

			arr[i] = Integer.parseInt(br.readLine());
		
			if(arr[i]%2==0){
				System.out.println("hello =" + arr[i]);
				sum = sum*arr[i];
			}
		}
		
		//System.out.println("Product of even numbers =" + sum);
	}
}
