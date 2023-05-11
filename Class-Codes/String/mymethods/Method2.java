import java.io.*;
class MyLengthDemo{
	static int mylength(String str){
		char arr[] = str.toCharArray();
		int count =0;

		for(int i=0;i<arr.length;i++){
			count++;
		}
		return count;
	}
	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter String");
		String str = br.readLine();

	
		int output = mylength(str);

		System.out.println(output);
	}
}
