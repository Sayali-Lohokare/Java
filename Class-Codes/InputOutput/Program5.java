import java.io.*;
class SocietyInfo{
	public static void main(String[] args)throws IOException{
		BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Society Nmae");
		String name1 = obj.readLine();

		System.out.println("Enter wing");
		char name2 = (char)obj.read();
		obj.skip(1);

		System.out.println("Enter flat No");
		int flatNo = Integer.parseInt(obj.readLine());

		System.out.println(name1);
		System.out.println(name2);
		System.out.println(flatNo);
	}
}
