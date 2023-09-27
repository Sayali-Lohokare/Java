import java.io.*;
class FindMinMax{
	static int MinMax(int arr[]){
		int max = arr[0];
		 int min = arr[0];

		for(int i=1;i<arr.length;i++){
			if(arr[i]>max){
				max = arr[i];
			}
			else if(arr[i]<min){
				min = arr[i];
			}

		}
		//System.out.println(min);
		//System.out.println(max);
		return max;
	}

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter the array no:");
		int n = Integer.parseInt(br.readLine());

		//System.out.println("enter elements");

		int arr[] = new int[n];

		System.out.println("enter the elements");
		for(int i=0;i<n;i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
		int max = MinMax(arr);
		//int min = MinMax(arr);

		System.out.println("the max no is" + max);
		//System.out.println("the min no is" + min);

		//System.out.println(FindMaxMin(min));
	}
}



