class Calculator{
	public int add(int n1,int n2){
		return n1+n2;
	}
	public int sub(int n1,int n2){
		return n1-n2;
	}
}
class AdvCalc extends Calculator{
	public int multi(int n1,int n2){
		return n1*n2;
	}
	public int div(int n1,int n2){
		return n1/n2;
	}
}
class Demo{
	public static void main(String[] args){

		AdvCalc c = new AdvCalc();
		int r1 = c.add(4,5);
		int r2 = c.sub(7,3);
		int r3 = c.multi(5,3);
		int r4 = c.div(15,4);

		System.out.println(r1 + " " + r2 + " " + r3 + " " + r4);
	}
}
