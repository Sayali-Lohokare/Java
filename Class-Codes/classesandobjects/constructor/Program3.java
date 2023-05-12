class ConstrDemo{
	ConstrDemo(){
		System.out.println("In Constructor");
	}
	void fun(){
		ConstrDemo obj = new ConstrDemo();
		System.out.println(obj);
	}
	public static void main(String[] args){

		ConstrDemo obj1 = new ConstrDemo();
		ConstrDemo obj2 = new ConstrDemo();

		System.out.println(obj1);
		System.out.println(obj2);

		obj1.fun();
	}
}
