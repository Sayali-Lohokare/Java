import java.io.*;
class SquareRoot{

	static int find(int num){
		int itr=0;
		for(int i=1;i<=num;i++){
			itr++;
			if(i*i==num){
				return i;
			}
		}
		System.out.println(itr);
		return -1;
	}
	

	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		System.out.println(find(num));
	}
}
	



