import java.io.*;
import java.util.*;
class MatchInfo{
	public static void main(String[] args){

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter PLayers info");

		String str = sc.next();

		StringTokenizer st = new StringTokenizer(str," ");

		System.out.println(st.countTokens());

		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
	
	}
}

