/*import java.io.*;
class FindElement{

	/*static int find(int n){
		int val = 0;
		for(int i=0;i<=n;i++){
			if(i==n){
				return arr[i];
			}
			System.out.println(arr[i]);
		}
		//return val;
	}

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[] = {1,2,3,4};
		int n = Integer.parseInt(br.readLine());

		for(int i=0;i<arr.length;i++){
			if(arr[i]==n){
				System.out.println(i);
			}
			//System.out.println(arr[i]);
		}
	}
}*/



import java.io.*;
class FindElement{

	static int element(int n, int arr[]){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==n){
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 int arr[] = {1,2,3,4};

		 System.out.println("Enter the element :" );
		int n = Integer.parseInt(br.readLine());

		int index = element(n,arr);
		System.out.println(index);
	}
}

		
