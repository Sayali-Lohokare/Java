class Demo{
	public static void main(String[] args){
		int arr[] ={10,20};
		int arr1[] ={10,20,30,40};
		char ch[] = {'A'};
		long arr2[] ={19234,234};

		System.out.println(System.identityHashCode(arr2));
		System.out.println(arr2);
	}
}
