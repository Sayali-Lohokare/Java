import java.io.*;
class PrintVowel{
	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//char ch[] = new char[7];

		System.out.println("Array size");
		char ch[] = new char[7];
		for(int i=0;i<ch.length;i++){
			ch[i] = (char)br.read();
		}
		System.out.println("Enter Letters");
		for(int i=0;i<ch.length;i++){
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'){
				System.out.println(ch[i]+ " ");
			}
		}
	}
}
