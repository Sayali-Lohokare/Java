/*import java.io.*;
class CountOfN{
	static int count(int n ){
		int sum = 0;
		int itr=0;
		for(int i=1;i<=n;i++){
			itr++;
			sum = sum+i;
		}
		System.out.println(itr);
		return sum;
	}
	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the numbers:");
		int n = Integer.parseInt(br.readLine());
		System.out.println(count(n));
	}
}

O/p = sum - 15
      itr - 5*/


import java.io.*;
class CountOfN{
	static int count(int n){
		int sum = 0;
		int itr = 0;

		//for(int i=1;i<=n;i++){

		sum = (n*(n+1))/2;
		
		System.out.println(itr);
		return sum;
	}

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the number:");
		int n = Integer.parseInt(br.readLine());
		System.out.println(count(n));
	}
}
