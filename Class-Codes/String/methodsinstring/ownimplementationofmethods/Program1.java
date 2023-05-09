import java.io.*;
class OwnConcatDemo{
	static void myconcat(String str1,String str2){
		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();

		char str[] = new char[arr1.length+arr2.length];

		for(int i=0;i<arr1.length;i++){
			str[i] = arr1[i];
		}

		for(int j=0;j<arr2.length;j++){
			str[arr1.length+1] = arr2[j];
		}
		System.out.println(str);
	}
	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter first string");
		String str1 = br.readLine();

		System.out.println("Enter second string");
		String str2 = br.readLine();

		myconcat(str1,str2);
	}
}




