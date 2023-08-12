import java.util.*;
class LinkedListDemo{
	public static void main(String[] args){

		LinkedList ll = new LinkedList();

		ll.add(10);
		ll.add(20.8f);
		ll.add("sayu");
		ll.add(16.8);

		/*ll.addLast(30);
		ll.addFirst("sayu");
		ll.add(20);*/

		/*System.out.println(ll);

		ll.add(2);
		System.out.println(ll);*/

		/*ll.removeFirst();
		System.out.println(ll);

		//public void addFirst(E);
		ll.addFirst(100);
		System.out.println(ll);

		//public void addLast(E);
		ll.addLast(300);
		System.out.println(ll);*/

		//public E get(int); we always have to give a container to store the data so that it could dbe printed, var or Object keywords can be used to print the O/P but instead of that particular datatype can also be used 
		String obj=(String)ll.get(0);
		System.out.println(obj);

		//public E set(int,E);
		/*ll.set(0,"papa");
		System.out.println(ll);*/

		//public void add(int,E);
		/*ll.add(3,"dad");
		System.out.println(ll);

		//public E remove(int);
		ll.remove(0);
		System.out.println(ll);*/

		//public int indexOf(java.lang.Object);
		ll.indexOf("dad");
		System.out.println(ll);

		//public int size();
		ll.size();
		System.out.println(ll);

		//public E peek();
		Integer i = ll.peek();
		System.out.println(i);


	}
}
