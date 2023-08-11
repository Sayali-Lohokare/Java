// it is dynamic array which means size of the array is not fix
// it contains heterogenous data i.e diffreent type of data 
//

import java.util.*;
class Demo{
	public static void main(String[] args){

		ArrayList al = new ArrayList();
//add() method
		al.add(10);
		al.add(20.5);
		al.add("pratyaa");
		al.add(20.9f);

		//public int size();
		
		System.out.println(al.size());

		System.out.println(al);

		al.add(3,"c2w");
		System.out.println(al);

		//boolean contains(java.lang.Object);
		System.out.println(al.contains("tanyaa"));
		System.out.println(al.contains(20));

		//int indexOf (gives the index of wrtten element)
		System.out.println(al.indexOf(10));
		System.out.println(al.indexOf(20.5));  

		//public E get(int); (gives the data from mentioned index)
		System.out.println(al.get(3));

		//public E set(int,E); (replaces the data to new data in mentioned index)
		System.out.println(al.set(2,"sayali"));
		System.out.println(al);

		//void add(int,E); (adds elemet to given index but if the size exceds then rte occurs)
		al.add(1,"hi");
		System.out.println(al);

		//public E remove(int); (gives o/p as elemt of only mentioned index)
		System.out.println(al.remove(2));

		//boolean remove(java.lang.Object);
		System.out.println(al.remove(1));
		System.out.println(al);

		//void clear(); [clears the whole array]
		al.clear();
		System.out.println(al);
		//System.out.println(al.clear());  [we cant write in this manner bcz as its return type is void so we cant write it in sop as we r printing the o/p]
		
		//boolean addAll(Collection);
		ArrayList al2 = new ArrayList();
		al2.add("hi");
		al2.add(100);
		al2.add(30.5f);

		al.addAll(al2);
		System.out.println(al2);

		//boolean addAll(int,Collection);
		al.addAll(3,al2);
		System.out.println(al2);

		//protected void removeRange(int,int)
		//al.removeRange(3,5); //CTE occurs as the method is protected
				     
		//public java.lang.Object()toArray();
		Object arr[] = al.toArray();
		System.out.println(arr);

		for(Object data : arr){
			System.out.println(data + " ");
		}

		//instead of Object keyword we can use var also as it allows all type
		//of data to be inserted in array without any restrictions 
		
		System.out.println(al.getClass().getName());

		
	}
}

