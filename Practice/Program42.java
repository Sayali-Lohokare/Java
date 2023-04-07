class SwitchDemo{
	public static void main(String[] args){
		int num=22;
		String size;
		
		switch(num){
			case 11:
				size="small";
				break;

			case 22:
				size="medium";
				break;

			case 33:
				size="large";
				break;

			default:
				size="unknown";
				break;

		}
		System.out.println("Size: " + size);
	}
}

