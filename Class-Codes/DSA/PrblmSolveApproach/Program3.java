import java.io.*;
class SquareRoot{
	//public static void main(String[] args)throws IOException{

		static int find(int num){
			int val=0;
			int itr = 0;
			for(int i=1;i<=num;i++){
				itr++;
				if(i*i<=num){
					val=i;
				}
				//System.out.println(itr);
			}
			System.out.println(itr);
			return val;
			//System.out.println(itr);
		}
	


		public static void main(String[] args)throws IOException{



		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		System.out.println(find(num));
		}
	}
