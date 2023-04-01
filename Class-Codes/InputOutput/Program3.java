import java.io.*;
class BufferedDemo{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Batsman Name");
		String name1 = br.readLine();

		System.out.println("Enter Bowler Name");
		String name2 = br.readLine();

		System.out.println(name1);
		System.out.println(name2);
	}
}
		
