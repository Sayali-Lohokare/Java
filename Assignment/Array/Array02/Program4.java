import java.io.*;
class SearchElement{
	public static void main(String[] args){
		int arr[] = {1,2,4,5,6};
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);

		System.out.println("Search specific element");
		int search_element = Integer.parseInt(br.readLine());

		for(int i=0;i<arr.length;i++){
			
			if(arr[i]==search_element){
				System.out.println("Element fount at index="+ i);
			}
		}
	}
}
