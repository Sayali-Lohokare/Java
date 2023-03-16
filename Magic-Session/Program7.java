class Reverse{
	public static void main(String[] args){
		int x = 7;
		int temp = 0;

		if(x%2==0){
			while(x>0){
				System.out.println(x);
				--x;
			}
	        else{
					System.out.println(x);
					temp = x-2;
				}
			}
		}
	}

