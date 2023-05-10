class SBDemo{
	public static void main(String[] args){

		String str1 = "Sayali";
		String str2 = new String("Lohokare");
		StringBuffer str3 = new StringBuffer("Core2Web");
		String str4 = str1.append(str3);

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
	}
}


		//ithe error yeiltring str4 la karan string madhe parametrs string ch lagtat stringbuffer chalat nahi
//		hya case madhe str1 ha string class la belong kartoy pn str3 string buffer la belong krto , so te chalat nahi
