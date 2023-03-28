class SwitchDemo{
	public static void main(String[] args){
		int x=5;
		switch(x){
			case 1:
				System.out.println("1");
				break;
			case 1+1:
				System.out.println("2");
				break;
			case 1+2:
				System.out.println("Firts-2");
				break;
			case 5:
				System.out.println("Second-5");
				break;
			case 2:
				System.out.println("Second-2");
				break;
			default:
				System.out.println("none");
				break;
		}
		System.out.println("After switch");
	}
}
