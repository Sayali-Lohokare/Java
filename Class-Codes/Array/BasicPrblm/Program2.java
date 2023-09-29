import java.io.*;
class FindMinMax{
	static int Max(int arr[]){
		int max = arr[0];
		// int min = arr[0];

		for(int i=1;i<arr.length;i++){
			if(arr[i]>max){
				max = arr[i];
			}
		}
		return max;
	}

	static int Min(int arr[]){
		int min = arr[0];

		for(int i=1;i<arr.length;i++){
			if(arr[i]<min){
				min = arr[i];
			}
		}
		return min;
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

		int max = Max(arr);
		int min = Min(arr);

		System.out.println(max);
		System.out.println(min);
	}
}

/*import java.io.*;
class Demo{
	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter the no");
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];

		System.out.println("enter the elememts");
		for(int i=0;i<n;i++){
			arr[i] = Integer.parseInt(br.readLine());
		}

		int min = arr[0];
		int max = arr[0];

		for(int i=1;i<n;i++){
			if(arr[i]<min){
				min = arr[i];
			}
			else if(arr[i]>max){
				max = arr[i];
			}
		}
		System.out.println("min value is:" + min);
		System.out.println("max value is :" + max);
	}
}*/



