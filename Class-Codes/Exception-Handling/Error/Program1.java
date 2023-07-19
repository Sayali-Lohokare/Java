// StackOverFlowError


class StackDemo{
	static void fun(int x){
		System.out.println(x);
		fun(++x);
	}
	public static void main(String[] args){

		try{
			fun(1);
		}
		catch(StackOverflowError obj){
			System.out.println("stackoverflow ");
			obj.printStackTrace();
		}
	}
}


//error cant be handled bcz loss is permanat in error
//but exceptions can be handled bcz they are the precausions taken before loss
//
