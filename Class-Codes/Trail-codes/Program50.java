class BinaryOperation{

	static int OperationsBinaryString(String str){
		if(str==null){
			return -1;
		}

		int result = str.charAt(0) - '0';


		for(int i=1;i<str.length();i=i+2){
			char operation = str.charAt(i);
			char digit = str.charAt(i+1);
			int num = digit- '0';

			switch(operation){

				case 'A':
					result = result&num;
					break;
				case 'B':
					result = result|num;
					break;
				case 'C':
					result = result^num;
					break;
			}
		}
		return result;
	}
	public static void main(String[] args){
		String str = "1C0C1C1AOB1";
		int result = OperationsBinaryString(str);
		System.out.println("Result: "+ result);
	}
}
