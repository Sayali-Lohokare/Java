import java.util.*;
class Demo{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		try{
			int x = sc.nextInt();
		}
		catch(RuntimeException obj){
			System.out.println("invalid");
		}
		catch(IOException io){
			System.out.println("IOException caught");
		}
		catch(Exception ex){
			System.out.println("exception caught");
		}
	}
}
		
		
