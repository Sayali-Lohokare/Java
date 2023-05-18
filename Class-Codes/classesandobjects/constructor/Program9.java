class Core2Web{
	String FavCourse = "Java";
	int noofCourses = 8;

	void display(){
		System.out.println(FavCourse);
		System.out.println(noofCourses);
	}
}
class Users{
	public static void main(String[] args){
		Core2Web obj = new Core2Web();
		obj.display();
	}
}
