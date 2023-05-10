class SBDemo{
	public static void main(String[] args){
		
		String str1 = "Shashi";
		String str2 = new String("Bagal");
		StringBuffer str3 = new StringBuffer("Core2Web");

		str1.concat(str2);
		str3.append(str2);

		System.out.println(str1); //shashi
		System.out.println(str2); //Bagal
		System.out.println(str3); //Core2WebBagal
	}
}


	//ithe error nai yenar rather output yeil karan stringbuffer class la string ani SB donhi che parametre chalu 
//	shaktat pn str1.concat(str2) ch output yenar nai karan te store karayla kahi obj ch nai banavla so GARBAGE COLLECTOR
//	tyala gheun jail ani single str1 ani str2 string print hoil.
