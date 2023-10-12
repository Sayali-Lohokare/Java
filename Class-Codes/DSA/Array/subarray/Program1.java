import java.io.*;
class SubArrayDemo{

	public static int find(int arr[]){

		int min = Integer.MIN_VALUE;
		int max = Integer.MAX_VALUE;
		int len=0;

		for(int i=0;i<arr.length;i++){
			if(arr[i] < min){
				min = arr[i];
			}
			if(arr[i]>max){
				max = arr[i];
			}
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]==min){
				for(int j=i+1;j<arr.length;i++){
					if(arr[j]==max){
						len=j-i+1;
					
					if(min>len){
						min=len;
					}
					break;
					}
				}
			}
			if(arr[i]==max){
				for(int k=i+1;k<arr.length;k++){
					if(arr[k]==min){
						lrn=k-i+1;
						if(max>len){
							max=len;
						}
					}
				}
				return min;
			}
		}
		System.out.println(min);
		
	}

							
	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter array size");
		int n = Integer.parseInt(br.readLine());

		System.out.println("eneter array elements");
		int arr[] = new int[n];

		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}

		int output = find(arr);

		System.out.println(output);
	}
