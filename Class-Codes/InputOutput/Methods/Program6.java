import java.util.*;
class Calculation{
	static void add(int a,int b){
		int ans = a+b;
		System.out.println(ans);
		
	}
	static void sub(int a,int b){
		int ans = a-b;
		System.out.println(ans);
		
	}
	static void div(int a,int b){
		int ans = a/b;
		System.out.println(ans);
	}
	static void mul(int a,int b){
		int ans = a*b;
		System.out.println(ans);
	
	}
	



	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter int values");

		int a = sc.nextInt();
		int b = sc.nextInt();

		add(a,b);
		sub(a,b);
		div(a,b);
		mul(a,b);
	}

}




