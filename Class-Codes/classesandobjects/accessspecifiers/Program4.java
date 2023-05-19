class Employee{
	int empId = 10;
	String name = "Kanha";
	static int y = 50;

	void empInfo(){
		System.out.println("ID ="+ empId);
		System.out.println("NAme ="+ name);
		System.out.println("y ="+ y);
	}
}
class MainDemo{
	public static void main(String[] args){
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();

		emp1.empInfo();
		emp2.empInfo();

		System.out.println("-----");

		emp2.empId = 20;
		emp2.name = "RAhul";
		emp2.y = 500;

		emp1.empInfo();
		emp2.empInfo();
	}
}
