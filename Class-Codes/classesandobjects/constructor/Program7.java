class Project{
	String projName = "OnlineEdu";
	int noofEmp = 20;

	void clientInfo(){
		String clientName = "Core2Web";

		System.out.println(clientName);
		System.out.println(projName);
		System.out.println(noofEmp);
	}
}
class C2W{
	public static void main(String[] args){
		Project obj = new Project();
		obj.clientInfo();
	}
}

