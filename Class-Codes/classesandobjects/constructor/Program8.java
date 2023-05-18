class MacD{
	int items = 5;
	String product = "fries";

	void Menu(){
		String Menu1 = "veg";
		String menu2 = "non-veg";

		System.out.println(items);
		System.out.println(product);
	}
}
class Users{
	public static void main(String[] args){
		MacD obj = new MacD();
		obj.Menu();
	}
}
