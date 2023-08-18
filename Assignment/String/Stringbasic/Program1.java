import java.io.*;
class LargestCharDemo{
	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter String");
		String str = br.readLine();

		char largestchar = ' ';
		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			if(ch>largestchar){
				largestchar=ch;
			}
		}
		//System.out.println("Largest character =" + largestchar);
	}
}
