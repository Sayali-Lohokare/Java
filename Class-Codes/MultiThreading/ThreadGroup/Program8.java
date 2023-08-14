// write code to display all active thread names belongs to system grp and its child grp


class ThreadGrpDemo{
	public static void main(String[] args){

		ThreadGroup tg = Thread.currentThread().getThreadGroup().getParent();

		Thread t[] = new Thread[tg.activeCount()];
		tg.enumerate(t);
		for(Thread t1 : t){
			System.out.println(t1.getName()+".."+t1.isDaemon());
		}
	}
}
