import java.util.*;
class Demo{
	public static void main(String[] args){

		Vector v = new Vector();

		for(int i=0;i<=10;i++){
			v.addElement(i);
		}
		System.out.println(v);

		Enumeration e = v.elements();// This creates an Enumeration object named e that is used to go through the elements in the Vector named v
		while(e.hasMoreElements()){//e.hasMoreElements(): This checks if there are more elements left to be processed in the Enumeration. It returns true if there are more elements, and false if all elements have been processed.
			Integer I = (Integer)e.nextElement();/*(Integer)e.nextElement();: This part does two things:

e.nextElement(): This retrieves the next element from the Enumeration object. In this case, the Enumeration is iterating through the elements in the Vector v.
(Integer): This is a type casting operation. It's used to convert the retrieved element into an Integer object. In Java, the Enumeration returns elements as objects of the base type (Object), so you need to explicitly cast them to their actual types.*/
			if(I%2==0){
				System.out.println(I);
			}
			System.out.println(v);
		}
	}
}
