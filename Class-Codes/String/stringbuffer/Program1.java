class StringBufferDemo{
	public static void main(String[] args){

		String str1 = "Shashi";
		String str2 = str1.concat("Bagal");

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	}
}
