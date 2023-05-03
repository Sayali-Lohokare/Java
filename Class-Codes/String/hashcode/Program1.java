class HashCodeDemo{
	public static void main(String[] args){

		String str1 = "Sayali";
		String str2 = new String("Sayali");
		String str3 = "Sayali";
		String str4 = new String("Sayali");

		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
	}
}
