import java.io.*;
class EvenOddDemo{
	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Array Size");
		int size = Integer.parseInt(br.readLine());
		int arr[] = new int[size];

		System.out.println("Enter Elements");

		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		int count1=0;
		int count2=0;

		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				count1++;
			}
			else{
				count2++;
			}
		}
		System.out.println("Count of even number =" + count1);
		System.out.println("Count of odd numbers =" + count2);
	}
}
