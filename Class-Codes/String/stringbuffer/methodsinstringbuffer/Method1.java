class AppendDemo{
	public static void main(String[] args){

		StringBuffer sb1 = new StringBuffer("Sayali");
		StringBuffer sb2 = new StringBuffer("Taanu");

		StringBuffer sb3 = sb1.append(sb2);

		System.out.println(sb3);
	}
}
