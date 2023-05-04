class Demo{
	public static void main(String[] args){

		String svar1 = "This is a string";
		String svar2 = "a String";
		String svar3 = "This is " + svar2;

		if(System.identityHashCode(svar1)==System.identityHashCode(svar3)){
			System.out.println("equal");
		}
		else{
			System.out.println("not equal");
		}
	}
}
