// user define example


import java.util.*;
class CricPlayer{
	int jerNo = 0;
	String name = null;

	CricPlayer(int jerNo,String name){
		this.jerNo = jerNo;
		this.name = name;
		// due to this only address will be printed

	}
	public String toString(){
		return jerNo + ":" + name;
	
		//return name;
		//return jerNo;
	}
}
class ArrayListDemo{
	public static void main(String[] args){

		ArrayList al = new ArrayList();
		al.add(new CricPlayer(18,"Virat"));
		al.add(new CricPlayer(7,"MSDhoni"));
		al.add(new CricPlayer(45,"Rohit"));

		System.out.println(al);

		al.add(33,"hardik");
		System.out.println(al);
	}
}

//here use "this" is mandatory as we are using add method and it creates new obj ever time with parameretw
