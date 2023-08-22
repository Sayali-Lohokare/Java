import java.util.*;
class Demo{
	public static void main(String[] args){

		LinkedList l = new LinkedList();

		l.add("sayu");
		l.add(21);
		l.add(8.77f);
		l.add(null);

		System.out.println(l);

		l.set(0,"tanu");
		System.out.println(l);

		l.add(0,"manya");
		System.out.println(l);

		l.removeLast();
		System.out.println(l);

		l.addFirst("lohokare");
		System.out.println(l);
	}
}
