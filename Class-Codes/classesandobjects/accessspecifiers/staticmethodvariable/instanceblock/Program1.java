class Demo{
	int x =10;
	Demo(){
		System.out.println("constructor");
	}
	{
		System.out.println("instance block");
	}
	public static void main(String[] args){
		Demo obj = new Demo();
		System.out.println("MAin");
	}
	{
		System.out.println("instance block 2");
	}
}
