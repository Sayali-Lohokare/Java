/* vector is a legacy class which means that it is originally written in c/c++ so it is a native method
// vector is mostly used with synchronization
// synchronized keyword when applied to any method that means only one thread can execute that method on given obj
// while executing any syn method the remaining threads are note aalowed to execute any other syn method they can execute non-syn methods only

Adding Elements:
add(element): Adds an element to the end of the vector.
add(index, element): Inserts an element at the specified index.
addAll(collection): Adds all elements from the given collection to the end of the vector.

Accessing Elements:
get(index): Retrieves the element at the specified index.
elementAt(index): Retrieves the element at the specified index (same as get).
firstElement(): Retrieves the first element.
lastElement(): Retrieves the last element.

Updating Elements:
set(index, element): Replaces the element at the specified index.

Removing Elements:
remove(index): Removes the element at the specified index.
removeElement(element): Removes the first occurrence of the specified element.
clear(): Removes all elements from the vector.

Querying and Searching:
size(): Returns the number of elements in the vector.
isEmpty(): Checks if the vector is empty.
contains(element): Checks if the vector contains the specified element.
indexOf(element): Returns the index of the first occurrence of the specified element.
lastIndexOf(element): Returns the index of the last occurrence of the specified element.

Synchronization:
synchronizedList(list): Creates a synchronized (thread-safe) view of a list.

Enumeration and Iteration:
elements(): Returns an enumeration of the elements in the vector.
iterator(): Returns an iterator over the elements in the vector.

Conversion:
toArray(): Returns an array containing all elements of the vector.

Capacity Management:
ensureCapacity(minCapacity): Increases the capacity of the vector.
trimToSize(): Reduces the capacity of the vector to match its size.*/


import java.util.*;
class VectorDemo{

	public static void main(String[] args){

		Vector v = new Vector();

		v.addElement(10);
		v.addElement(20);
		v.addElement(40);
		v.add(100);
		v.add(3,50);
		//v.addAll(v);

		v.set(2,30);

		/*get(index);
		System.out.println(v.get(0));*/

		//elementAt(index);
		//System.out.println(v.elementAt(1));

		/*firstElemet();
		System.out.prsntln(v.firstElement());*/

		//set(index,element);
		//v.set(0,100);
		/*System.out.println(v.remove(1));
		System.out.println(v.removeElement(100));
		System.out.println(v);*/

		//System.out.println(v.size());
		//
		System.out.println(v.toArray());
		


	}
}
