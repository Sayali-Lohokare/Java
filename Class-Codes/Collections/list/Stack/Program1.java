/* stack is child class of vector
 * insertion order is preserved while o/p
 * the i/p order = o/p order
 */

import java.util.*;
class StackDemo{
	public static void main(String[] args){ 

		Stack s = new Stack();

		s.push(10);
		s.push(10);
		s.push(10);
		//s.push(10);

		//System.out.println(s);
		
		System.out.println(s.pop());
		System.out.println(s.pop());  //here the o/p will be from unpside down as the stack has patter of FILO
		System.out.println(s.pop());
		//System.out.println(s.peek());*/  //it removes the uppermost eleemnt of the stack
		System.out.println(s.empty());  //the stack will become empty only when we pop every element from it after poping the elements if empty method is call then ans is T else F               
	}
}


