class Demo{
	public static void main(String[] args){

		StringBuffer var1 = new StringBuffer("Shashi");
		String var2 = new String("Shashi");

		if(var2.contentEquals(var1)){
			System.out.println("Both are equal");
		}
		else{
			System.out.println("not equal");
		}
	}
}
