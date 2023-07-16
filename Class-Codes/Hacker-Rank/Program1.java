import java.util.*;
class Demo{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

	//	try{
			int n = sc.nextInt();

	
		if(n%2==0){
			System.out.println("Weird");
		}

		else if(n>=2 && n<=5){
			System.out.println("Not Weird");
		}
		else if(n>=6 && n<=20){
			System.out.println(" Weird");
		}
		else if(n>20){
			System.out.println("Not Weird");
		}
		else {
			System.out.println("Invalid");
		}
		
		//}
		/*catch (InputMismatchException obj){
			System.out.println("No. is in float, please enter input only in int");
			int n = sc.nextInt();
		}*/


	}
}


