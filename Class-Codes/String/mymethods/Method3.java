import java.io.*;
class Method3{
	char mycharAt(String str,int i){
		char arr[] = str.toCharArray();

		return arr[i];
	}
	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter String");
		String str = br.readLine();

		System.out.println("Enter index");
		int i = Integer.parseInt(br.readLine());

		Method3 obj = new Method3();
		char ret = obj.mycharAt(str,i);

		System.out.println(ret);
	}
}

