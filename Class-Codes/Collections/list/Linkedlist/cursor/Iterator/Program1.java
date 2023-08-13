// iterator is a cursor which is  universally used for all collection types i.e [list,set,queue]


/*public interface java.util.Iterator<E>
 * ietrator is an interface which is unidirectional bcz it can only move in one direction(forward)
 * we use iterator to acces each element of an array by iterartiong on each element
 * iterator can only re,ove the data but cant add the data
 *
 *
 * iterator has 2 meethods
 * (1) public abstarct boolean hasNext() - it means that it will point to next element in the array without sitting/moving on that element and if ask to return the data it will rturn i  T/F which means if data is present tehn T else F
 * to find this next element iterator helps to move along each element
 *
 * (2) public abstract E next() - it means that it acces the actual element on which the iterator was pointing , whilw accesing this element the iterator stands up on the actual element and gives the o/p 
 * it has return type as E and returns the actual data
 *
 * (3) public default void remove() - it removes the whole array
 */
import java.util.*;
class IteratorDemo{
	public static void main(String[] args){

		ArrayList al = new ArrayList();

		al.add("mom");
		al.add("dad");
		al.add("tanu");

/*(Interface)*/Iterator it = al.iterator();/*(method)*/
		
	while(it.hasNext()){
		if("dad".equals(it.next()));
		it.remove();

		//System.out.println(it.next());
	}
		System.out.println(al);
	}
}



