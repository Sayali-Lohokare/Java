class Voters{
	String Name = "ShivSena";
	int x = 200;

	static int y = 5;

	void display(){
		System.out.println("Party name =" + Name);
		System.out.println("Number of votes =" + x);
		System.out.println("Number of total Parties =" + y);
	}
}
class Election{
	public static void main(String[] args){
		Voters obj1 = new Voters();
		Voters obj2 = new Voters();

		obj1.display();
		obj2.display();

		obj2.Name = "BJP";
		obj2.x = 100;
		obj2.y = 7;

		obj1.display();
		obj2.display();
	}
}


