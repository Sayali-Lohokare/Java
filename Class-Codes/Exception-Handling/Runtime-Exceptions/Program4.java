import java.io.*;
class HoneyMoonException extends RuntimeException{

	HoneyMoonException(String str){
		super(str);
	}
}
class Marriage{
	public static void main(String[] args){

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

				try{
				int x = Integer.parseInt(br.readLine());

				//System.out.println("enter no of condoms");
				

					if(x<1);
					throw new HoneyMoonException("u cant have sex ");
				}
				catch(IOException io){
					System.out.println("IOException caught");
				}
				catch(HoneyMoonException he){
					System.out.println("cant have sex due to less than 1 condom :[");
				}
	}
}
