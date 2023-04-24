/*import java.io.*;
class CommomElement{
	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Array size");
		int size1 = Integer.parseInt(br.readLine());
		int size2 = Integer.parseInt(br.readLine());
		int arr1[] = new int[size1];
		int arr2[] = new int[size2];

		System.out.println("Enter first array");
		for(int i=0;i<arr1.length;i++){
			arr1[i] = Integer.parseInt(br.readLine());
		}
		System.out.println("Enter second array");
		for(int i=0;i<arr2.length;i++){
			arr2[i] = Integer.parseInt(br.readLine());
		}

		for(int i=0;i<arr1.length;i++){
			arr1[i] = Integer.parseInt(br.readLine());
			for(int j=0;j<arr2.length;j++){
				arr2[j] = Integer.parseInt(br.readLine());
				if(arr1[i]==arr2[j]){
					System.out.println("Common element=" + arr1[i]);
					
				}
			}
		}
	}
}*/
import java.io.*;
class CommomElement{
	public static void main(String[] args)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter first array size");
		int size1 = Integer.parseInt(br.readLine());
		int arr1[] = new int[size1];

		System.out.println("enter first array");
		for(int i=0;i<arr1.length;i++){
			arr1[i] = Integer.parseInt(br.readLine());
		}

		System.out.println("Enter second array size");
		int size2 = Integer.parseInt(br.readLine());
		int arr2[] = new int[size2];

		System.out.println("Enter second array");
		for(int i=0;i<arr2.length;i++){
			arr2[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i=0;i<arr1.length;i++){

			for(int j=0;j<arr2.length;j++){

				if(arr1[i]==arr2[j]){

					System.out.println("Commom element=" + arr1[i]);
					
				}
			}
		}
	}
}


