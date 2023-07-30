class A{
	public void m1(){
	}
}
class B extends A{

	A obj = new A();
	obj.m1();

	B obj1 = new B();
	obj1.m1();

	A obj3 = new B();
	//obj3.m1();
}
