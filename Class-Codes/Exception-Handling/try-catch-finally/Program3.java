import java.io.*;
class Demo{
	public static void main(String[] args){

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try{

			String str = br.readLine();
			System.out.println(str);

			int x = Integer.parseInt(br.readLine());
		}

			
	
		//System.out.println(x);

		catch(IOException io){
			System.out.println("IOException caught");
		}
		/*catch(NumberFormatException obj){
			System.out.println("enter int value");
		}*/
		catch(ArithmeticException ae){
			System.out.println("Enter divisible value");
		}
		/*catch(IllegalArgumentException ie){
			System.out.println("enter correct data");
		}*/
		catch(Exception obj1){
			System.out.println("in exception");
			String str = br.readLine();
		}
		
	}
}


