/*import java.io.*;
class Difference{

	static int CountDiff(int n, int m){
		int count = 0;
		int itr = 0;
		for(int i=n;i<=m;i++){
			itr++;
			count++;
		}
		System.out.println(itr);
		return count;
	}
	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter two numbers:");
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		int ret = CountDiff(n,m);
		System.out.println(ret);
	}
}
O/P = 6 = diff
      6 = itr*/


import java.io.*;
class Difference{

	static int CountDiff(int n , int m){
		int itr = 0;
		int count = 0;
	//	for(int i=n;i<=m;i++){
			itr++;
		count = m-n+1;
		
		System.out.println(itr);
		return count;
	}
	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the numbers:");
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());

		System.out.println(CountDiff(n,m));
	}
}

O/P = 1 = itr
      6 = diff





