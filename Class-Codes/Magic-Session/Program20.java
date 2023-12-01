class Scope{
	public static void main(String[] args){
		int x = 80;y=20;
		{
			
			System.out.println(x +" "+y);
		}
		{
			x = 15;
			
			System.out.println(x+ " "+y);
		}
		
			System.out.println(x+" "+y);
		}
	}
