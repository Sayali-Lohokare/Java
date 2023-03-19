class Days{
	public static void main(String[] args){
		int n = 7;
	        int i = 2;
		while(n!=-1){
			if(i<=n){
				System.out.println(n + "days remaining");
			}
			else if(n == 1){
				System.out.println(n + "day remaining");
			}
			else if(n == 0){
				System.out.println(n + "is a due date");
			}
			n--;
			i++;
		}
	}
}


