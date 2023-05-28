class Demo{
	static int x = 10;

	static{
		static int y = 20;
	}
	void fun(){
		static int z = 20;
	}
	static void gun(){
		static int z = 20;
	}
}
