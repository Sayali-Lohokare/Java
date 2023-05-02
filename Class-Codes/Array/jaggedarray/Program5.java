import java.io.*;
class Demo{
	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[][] = new int[3][];

		int i = Integer.parseInt(br.readLine());
		arr[0] = new int[i];

		int j = Integer.parseInt(br.readLine());
		arr[1] = new int[j];

		int k = Integer.parseInt(br.readLine());
		arr[2] = new int[k];

		for(int m=0;m<arr.length;m++){

			for(int n=0;n<ar[i].length;n++){

				arr[i][j] = Integer.parseInt(br.readLine());
			}
			System.out.println();
		}
	}



