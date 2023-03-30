class NestedSwitchDemo{
	public static void main(String[] args){
		String str="Non-veg";
		System.out.println("Oh Pune");
		switch(str){
			case"veg":
				{
					String str1="Paneer";
					switch(str1){
						case"Kabaab":
							System.out.println("Spicy");
							break;
						case"Paneer":
							System.out.println("Spoongy");
							break;
					}
				}
				break;
			case"Non-veg":
				{
					String str1="Tandoor";
					switch(str1){
						case"Tandoor":
							System.out.println("Tasty");
							break;
						case"Palak Crispy":
							System.out.println("Crispy");
							break;
					}
				}
				break;
		}
		System.out.println("After Switch");
	}
}
