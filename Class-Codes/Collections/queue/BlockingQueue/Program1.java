import java.util.concurrent.*;
class Demo{
	public static void main(String[] args){

		BlockingQueue bQueue = new ArrayBlockingQueue(3);
		bQueue.offer(10);
		bQueue.offer(20);
		bQueue.offer(30);

		System.out.println(bQueue);

		bQueue.put(40);
	}

		//try{

		//bQueue.put(40);
		//System.out.println(bQueue);

	//}
	//catch(InterruptedException ie){
	//}*/
}
	

