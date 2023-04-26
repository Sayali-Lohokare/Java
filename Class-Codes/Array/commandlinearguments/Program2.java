class ArrayDemo{
	void fun(int arr[]){
		arr[1]=7000;
		arr[2]=8000;
	}
	public static void main(String[] args){

		int arr[] = {1000,2000,3000,4000};

		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);

		ArrayDemo obj = new ArrayDemo();
		obj.fun(arr);

		for(int x:arr){
			System.out.println(x);
		}
		int x=7000;
		int y=8000;

		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(y));
	}
}

