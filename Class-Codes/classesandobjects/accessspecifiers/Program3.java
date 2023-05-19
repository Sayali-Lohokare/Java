class Employee{
	int empId =10;
	String str = "Kanha";

	void empInfo(){
		System.out.println("Id =" + empId);
		System.out.println("Name =" + str);
	}
}
class Company{
	public static void main(String[] args){
		Employee emp1 = new Employee();
		emp1.empInfo();

		System.out.println(emp1.empId);
		System.out.println(emp1.str);
	}
}
