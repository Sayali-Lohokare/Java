//internal implementation of cursors


import java.util.*;
class CursorDemo{
	public static void main(String[] args){

		Vector v = new Vector();

		Enumeration e = v.elements();
		Iterator itr = v.iterator();
		ListIterator ll = v.listIterator();

		System.out.println(v.getClass().getName());
		System.out.println(itr.getClass().getName());
		System.out.println(ll.getClass().getName());
	}
}
