class MergeArray{
	public static void main(String[] args){

		//System.out.println("Enter value in First Array");
		int a[] = {10,20,30,40,50};
		System.out.println(a);

		//System.out.println("Enter values fir second array");
		int b[] = {9,18,27,36,45};
		System.out.println(b);
		int c[] = {10,20,30,40,50,9,18,27,36,45};
		

		//int A[] = new int[10,20,30,40,50];
		//int B[] = new int[9,18,27,36,45];
		//int C[] = new int[10,20,30,40,50,9,18,27,36,45];

		//System.out.println("Enter arr1.length values");
		for(int i=0;i<5;i++){
			c[i]=a[i];
		}
		//System.out.println("Enter arr2.length values");
		for(int i=0;i<5;i++){
			c[a.length+i]=b[i];
		//for(int i=0;i<arr1.length;i++){
			//arr3[i]=arr1[i];
		
			//for(int i=0;i<arr2.length;i++){
				//arr3[arr1.length+i]=arr2[i];
			}
		
		
		System.out.println("Merge array");
		for(int i=0;i<10;i++){
			System.out.println(c[i]+" ");
		}
	}
}


