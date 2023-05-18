class Hotel{
	int ratings = 5;
	String BestHotel = "Taj Hotel";

	void display(){
		System.out.println(ratings);
		System.out.println(BestHotel);
	}
	public static void main(String[] args){
		Hotel obj = new Hotel();
		obj.display();
	}
}
