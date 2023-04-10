import java.io.*;
import java.util.*;
class StringDemo{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Society name,wing,flat no");
		String info = br.readLine();
		System.out.println(info);
		String Tokenizer obj=new String Tokenizer(info,",");

		String token1=obj.nextToken();
		String token2=obj.nextToken();
		String token3=obj.nextToken();

		System.out.println("Society="+token1);
		System.out.println("wing="+token2);
		System.out.println("flat="+token3);
	}
}

