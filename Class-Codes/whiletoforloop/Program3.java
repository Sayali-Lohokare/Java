class Digit{
	public static void main(String[] args){
		int N = 942111423;
		int count = 0;
		for(int i = N;N!=0;count++){
			N=N/10;
		}
		System.out.println(count);
	}
}
