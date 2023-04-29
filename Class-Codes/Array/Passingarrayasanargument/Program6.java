class Demo{
	static void fun(int xarr[]){
		for(int x : xarr){
			System.out.println(x);
		}
		
	}
	public static void main(String[] args){
		int arr[] = {10,20,30,40};
		for(int x : arr){
			System.out.println(x);
		}
		fun(arr);
		
	}
}
