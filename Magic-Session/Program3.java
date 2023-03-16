class Count{
	public static void main(String args[]){
		int num = 942111423;
		int count = 0;
		while(num >0){
			
			num = num / 10;
			++count;
		}
		System.out.println("count of digits=" +count);
	}
}
