import java.io.*;
class DuplicateDemo{
	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter String");
		String str = br.readLine();
		char ch[] = str.toCharArray();

		System.out.println("Duplicate characters =");

		for(int i=0;i<str.length();i++){
			for(int j=i+1;j<str.length();j++){
				if(ch[i]==ch[j]){
					System.out.println(ch[j]);
				}
			}
		}
	}
}
