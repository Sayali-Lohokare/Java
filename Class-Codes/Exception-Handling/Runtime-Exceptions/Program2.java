// NumberFormatexception


import java.io.*;
class Input{
	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		System.out.println(str);

		br.close();

		String str2 = br.readLine();
		System.out.println(str2);

	}
}

