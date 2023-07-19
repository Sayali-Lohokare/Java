// finally block

import java.io.*;
class Demo{

		/*void m1(){

		}

		void m2(){

		}*/

		public static void main(String[] args){

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try{

			String str = br.readLine();
			
			System.out.println(str);

			int x = Integer.parseInt(br.readLine());
			}
			catch(IOException io){
				System.out.println("ioE:");
			}

			try{
				System.out.println(10/0);
			}
			catch(ArithmeticException ae){
				System.out.println("here");
			}
		
			finally{
				System.out.println("connections closed");
			}
		}
}

