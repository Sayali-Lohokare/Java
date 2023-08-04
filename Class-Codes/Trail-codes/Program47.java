class Demo{

	{
		System.out.println("Instance Block");
	}
	Demo(){
		System.out.println("constructor");
	}
	public static void main(String[] args){
		System.out.println("hii");
		Demo obj = new Demo();
	}
}
