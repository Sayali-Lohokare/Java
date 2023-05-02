class StringDemo{
	public static void main(String[] args){

		String str1 = "Pratik";
		String str2 = "Sayali";

		System.out.println(str1+str2);

		String str3 = "PratikSayali";
		String str4 = str1+str2;

		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
	}

}
