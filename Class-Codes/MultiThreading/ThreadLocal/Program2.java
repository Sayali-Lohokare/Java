class ThreadDemo{
	public static void main(String[] args){

		ThreadLocal t1 = new ThreadLocal(){

		public Object initialValue(){
			return 1;
		}
	};
	System.out.println(t1.get());
	t1.set(2);
	System.out.println(t1.get());
	t1.remove();
	System.out.println(t1.get());
	}
}

