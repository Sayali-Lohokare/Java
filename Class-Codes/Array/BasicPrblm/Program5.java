/*import java.io.*;
class ReplaceZero{
	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter the number :");
		int n= Integer.parseInt(br.readLine());

		int arr[] = new int[n];

		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}

		//int output = arr[i];

		for(int i=0;i<arr.length;i++){
			if(arr[i]==0){
				arr[i]=5;
			}
			System.out.print(arr[i]);
			System.out.println();


		}

		//System.out.println(output);
	}
}*/



/*import java.io.*;
class ReplaceDemo{

	static int find(int arr[]){

		int val = -1;

		for(int i=0;i<arr.length;i++){
			if(arr[i]==0){
				arr[i]=5;
			
			}
			else{
				val = arr[i];
			}
			//return arr[i];
		}
		return val;
	}
	public static void main(String[] args)throws IOException{

		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter the number");
		int n = Integer.parseInt(br.readLine());

		int arr[] = new int[n];

		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}

		 find(arr);

		 

		for(int i=0;i<arr.length;i++){


		System.out.println(arr[i]);
		}
	}
}*/




import java.io.*;
class ReplaceDemo{
	 
	static int ArrayList find(int ArrayList){

		for(int i=0;i<arr.length;i++){
			if(list.get(i)==0){
				list.set(i,5);
			}
		}
		return list;
	}
	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter the number");
		int n = Integer.parseInt(br.readLine());

		ArrayList al = new ArrayList();

		System.out.println("enter the elements");
		for(int i=0;i<arr.length;i++){
			list.add(Integer.parseInt(br.readLine()));
		}

		int output = find(int ArrayList);

		for(int i=0;i<arr.length;i++){
			System.out.println(output);
		}
	}
}





