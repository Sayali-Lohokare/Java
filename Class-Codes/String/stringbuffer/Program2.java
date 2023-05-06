class Demo{
	public static void main(String[] args){

		StringBuffer str1 = new StringBuffer("Shashi");

		System.out.println(System.identityHashCode(str1));

		str1.append("Bagal");

		System.out.println(str1);

		System.out.println(System.identityHashCode(str1));
	}
}
