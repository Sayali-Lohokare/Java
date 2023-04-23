import java.io.*;
class DisplaySum{
	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Array size");
		int size = Integer.parseInt(br.readLine());
		int arr[] = new int[size];

		System.out.println("Enter elements");
		for(int i=0;i<arr.length;i++){
		arr[i]=Integer.parseInt(br.readLine());
	}
	int sum1=0;
	int sum2=0;
	for(int i=0;i<arr.length;i++){
		if(arr[i]%2==0){
			sum1=sum1+arr[i];
		}
		else{
			sum2=sum2+arr[i];
		}
	}
	System.out.println("Sum even number=" + sum1);
	System.out.println("Sum odd number=" + sum2);
}
}

