class Demo{
	static{
		System.out.println("static block 1");
	}
	public static void main(String[] args){
		System.out.println("In Demo Main");
	}
}
class Client{
	static{
		System.out.println("static block 2");
	}
	public static void main(String[] args){
		System.out.println("In client main");
	}
	static{
		System.out.println("static block 3");
	}
}
