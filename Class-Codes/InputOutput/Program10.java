import java.io.*;
import java.util.*;
class MatchInfo{
	public static void main(String[] args)throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Teams Name,Group,Runs");
		String info=br.readLine();
		System.out.println(info);
		StringTokenizer obj=new StringTokenizer(info,",");

		String token1 = obj.nextToken();
		String token2 = obj.nextToken();
		String token3 = obj.nextToken();

		String TeamName= token1;
		char A = token2.charAt(0);
		int runs = Integer.parseInt(token3);
		
		

		System.out.println("Teams Name=" + token1);
		System.out.println("Group=" + token2);
		System.out.println("Runs=" + token3);
	}
}
