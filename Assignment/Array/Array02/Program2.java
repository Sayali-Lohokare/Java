import java.io.*;
class EvenOddNumber{
	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Array size");
		int size = Integer.parseInt(br.readLine());
		int arr[] = new int[size];

		System.out.println("Enter elements");
			for(int i=0;i<arr.length;i++){
				arr[i] = Integer.parseInt(br.readLine());
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
	System.out.println("Number of even elements=" + count1);
	System.out.println("Number of odd elements=" + count2);
	}
}

	
