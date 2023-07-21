import java.io.*;
class MemoryFullException extends RuntimeException{

	MemoryFullException(String str){
		super(str);
	}
}
class MailBox{
	public static void main(String[] args){

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try{
			int x = Integer.parseInt(br.readLine());
			//System.out.println(x);

			if(x>100);
			throw new MemoryFullException("storage is full");
		}
		catch(IOException io){
			//System.out.println("storage is full");
			System.out.println("IOException caught");
		}
		catch(MemoryFullException mf){
			System.out.println("storage is full");
		}
	}
}
