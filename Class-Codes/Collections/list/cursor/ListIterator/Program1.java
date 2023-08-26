import java.util.*;
class ListIteratorDemo{
	public static void main(String[] srgs){

		LinkedList ll = new LinkedList();

		ll.add("ram");
		ll.add("lakshman");
		ll.add("sita");
		ll.add("ravan");

		System.out.println(ll);//[ram,lakshman,sita,ravan]

		ListIterator itr = ll.listIterator();
		while(itr.hasNext()){

			String s = (String)itr.next();

			if(s.equals("ram")){
				itr.remove();//[lakshman,sita,ravan]
			}
			else if(s.equals("lakshman")){
				itr.add("hanuman");//[lakshman,hanuman,sita,ravan]
			}
			else if(s.equals("sita")){
				itr.set("draupadi");//[lakshman,hanuman,draupadi,ravan]
			}
			
		}
		System.out.println(ll);//[lakshman,hanuman,sita,ravan]
	}
}

