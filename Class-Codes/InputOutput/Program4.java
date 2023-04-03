import java.io.*;
class PlayerInfo{
	public static void main(String[] args)throws IOException{
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Player Name");
		String name1= obj.readLine();
		
		System.out.println("JerNo");
		int JerNo=Integer.parseInt(obj.readLine());

		System.out.println("Enter Avg");
		float avg=Float.parseFloat(obj.readLine());

		System.out.println(name1);
		System.out.println(JerNo);
		System.out.println(avg);
	}
}
