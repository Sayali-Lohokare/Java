import java.util.concurrent.*;
class Demo{
	public static void main(String[] args)throws InterruptedException{

		BlockingQueue bQueue = new ArrayBlockingQueue(3);

		bQueue.put(10);
		bQueue.put(20);
		bQueue.put(30);

		System.out.println(bQueue);

		bQueue.offer(40,5,TimeUnit.SECONDS);
		System.out.println(bQueue);

		bQueue.take();
		System.out.println();

		ArrayList al = new ArrayList();
		System.out.println("ArrayList"+al);

		

	}
}
