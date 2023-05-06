class Demo{
	public static void main(String[] args){

		StringBuffer var1 = new StringBuffer("Shashi");
		StringBuffer var2 = new StringBuffer("Shashi");

		System.out.println(var1.equals(var2));
		var1.length(3);
		System.out.println(var1);
	}
}
