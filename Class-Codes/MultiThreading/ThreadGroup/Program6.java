class Demo{
	public static void main(String[] args){

		ThreadGroup g = new ThreadGroup("thread grp");
		Thread t1 = new Thread(g,"thread-1");
		Thread t2 = new Thread(g,"thread-2");
		g.setMaxPriority(10);
		Thread t3 = new Thread(g,"thread-3");
		System.out.println(t3.getPriority());

		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(t3.getPriority());
	}
}

