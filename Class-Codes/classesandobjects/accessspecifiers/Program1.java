class Demo{
	int numCourses = 8;
	private String favCourse = "java";

	void display(){
		System.out.println(numCourses);
		System.out.println(favCourse);
	}
}
class Students{
	public static void main(String[] args){
		Demo obj = new Demo();
		obj.display();

		System.out.println(obj.numCourses);
		System.out.println(obj.favCourses);
	}
}
