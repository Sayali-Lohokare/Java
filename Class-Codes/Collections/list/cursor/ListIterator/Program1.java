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
			if(itr.equals("ram")){
				itr.remove();//[lakshman,sita,ravan]
			}
			else if(itr.equals("lakshman")){
				itr.add("hanuman");//[lakshman,hanuman,sita,ravan]
			}
			else if(itr.equals("sita")){
				itr.set("draupadi");//[lakshman,hanuman,draupadi,ravan]
			}
			
		}
		System.out.println(itr);//[lakshman,hanuman,sita,ravan]
	}
}

