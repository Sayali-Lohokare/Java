class Demo{
	public static void main(String[] args){

		float arrFloat[] = new float[5];

		for(int i=0;i<10;i++)
			arrFloat[i] = i+i;
		System.out.println(arrFloat[3]);
	}
}


		//as there is no syntax error so compile time error will not occur
//		but as the range of float is 5 and in for loop the i is accessing the value 
//		which is more than 4 i.e 10 
//		so the error will occur at run time i.e ArrayIndexOutOfBound
