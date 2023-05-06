class Demo{
	public static void main(String[] args){

		String str1 = new String("Shashi");
		String str2 = new String("Shashi");

		if(System.identityHashCode(str1).equals(System.identityHashCode(str2))){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
	}
}
