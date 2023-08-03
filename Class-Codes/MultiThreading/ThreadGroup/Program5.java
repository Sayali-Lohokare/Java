class Demo{
	public static void main(String[] args){

		ThreadGroup g = new ThreadGroup("first group");
		System.out.println(g.getParent().getName());

		ThreadGroup g1 = new ThreadGroup(g,"second grp");
		System.out.println(g1.getParent().getName());
	}
}
