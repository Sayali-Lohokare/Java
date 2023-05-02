class StringDemo{
	public static void main(String[] args){

		String str1 = "Sayali";
		String str2 = new String("Sayali");

		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));

		String str3 = "Sayali";
		String str4 = new String("Sayali");

		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
	}
}
