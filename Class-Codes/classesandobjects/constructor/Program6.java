class Demo{
	int x = 10;
	String str1 = "Shashi";

	void fun(){
		String str2 = "Shashi";
		String str3 = new String("Core2Web");

		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
	}
}

class Users{
	public static void main(String[] args){
		Demo obj = new Demo();
		obj.fun();
	

		System.out.println(str2);
		System.out.println(str3);
		//System.out.println(System.identityHashCode(str1));
	}
}
//}


