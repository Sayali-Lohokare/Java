class CricPlayer{

	int n = 0;
	String s = null;
	CricPlayer(int n , String s){
		super(n,s);
	}

	 void m1(int n,String s){

		System.out.println(12);
		System.out.println("virat");
	}
}
class Demo{
	public static void main(String[] args){

		CricPlayer obj = new CricPlayer(0,null);
		obj.m1();
	}
}

//if we want to use super keyword in code then it is mandatory to have parent child relation between classes and super is used to call the constructor or method of parent class
