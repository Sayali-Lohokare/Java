class Demo{
	void m2(){
		System.out.println("in m2");
	}
	void m1(){
		System.out.println(10/0);
		m2();
	}
	public static void main(String[] args){
		Demo obj = new Demo();
		obj.m1();
	}
}
