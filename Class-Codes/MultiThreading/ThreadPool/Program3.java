/* threadpool is the pool of already created threads ready to do our jobs, in java 1.5 version introduce TP framework to implement TP
 * TP framework is also known as executor framework
 * we can crrate threadpool == ExecutorService service = Executors.newFixedThreadPool(3);
 * we can submit Runnable job by using "submit" method == service.submit(job);
 * we can shutdown Executorservice by using "shutdown" mwthod == service.shutdown();
 * by default TP size is 60 one can use various means to customize the size according to need
 *
 * NOTE : while designing web servers and aplication servers we can use TP concept
 */

import java.util.concurrent.*;
class PrintJob implements Runnable{
	String name;

	PrintJob(String name){
		this.name=name;
		//super(name);
	}
	public void run(){
		System.out.println(name+ "job is started bye thread:" + Thread.currentThread().getName());

		try{
			Thread.sleep(5000);
		}
		catch(InterruptedException ie){
		}

		System.out.println(name + "job is completed by thread:" + Thread.currentThread().getName());
	}
}
class ExecutorDemo{
	public static void main(String[] args){

		PrintJob jobs[] = {new PrintJob("sayu"),new PrintJob("mayu"),new PrintJob("tanu"),new PrintJob("kanu")};

		ExecutorService service = Executors.newFixedThreadPool(3);

		for(PrintJob job : jobs){
			service.submit(job);
		}
		service.shutdown();
	}
}
