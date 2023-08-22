import java.util.*;
class Demo{
	public static void main(String[] args){

		Stack s = new Stack();

		s.push("A");
		s.push(10);
		s.push(3.5f);
		s.push(1.1);
		s.push(null);

		System.out.println(s);
		System.out.println(s.pop());//null bcz stack follows LIFO method and delete the asked elemnt
		System.out.println(s);//[A,10,3.5f,1.1]
		System.out.println(s.peek());//returns the last value from array without removing it from array
		System.out.println(s);
		System.out.println(s.search("A"));
		System.out.println(s.search("X"));
		System.out.println(s.empty());

	}
}
