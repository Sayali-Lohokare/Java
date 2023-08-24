import java.util.*;
class IteratorDemo{
	public static void main(String[] args){

		ArrayList al = new ArrayList();

		for(int i=0;i<=10;i++){
			al.add(i);
		}
		System.out.println(al);

		Iterator itr = al.iterator();
		while(itr.hasNext()){
			Integer I = (Integer)itr.next();/*(Integer)e.nextElement();: This part does two things:

e.nextElement(): This retrieves the next element from the Enumeration object. In this case, the Enumeration is iterating through the elements in the Vector v.
(Integer): This is a type casting operation. It's used to convert the retrieved element into an Integer object. In Java, the Enumeration returns elements as objects of the base type (Object), so you need to explicitly cast them to their actual types.*/
				if(I%2==0)
				System.out.println(I);
			else
				itr.remove();
			System.out.println(itr.next());
		}
		System.out.println(al);
	}
}
