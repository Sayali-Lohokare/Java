class SBDemo{
	public static void main(String[] args){

		String str1 = "Sheela";
		String str2 = new String("Lohokare");
		StringBuffer str3 = new StringBuffer("Tanishka Associates");
		String str4 = str1.concat(-Xdiags:verbose);
		StringBuffer str5 = str3.append(str2);

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
	}
}



	//ithe error yeil karan str4 string madhe apan stringbuffer str3 la concat krtoy 
//	je java allow karat nhi karan string class la concat karayla string che ch parameters lagtat
//	ithe "stringbuffer cannot be converted to string " ashi erroto yete karan string class la stringbuffer class method tr bhetli ahe 
//	pn to concat nai kru shakat 

