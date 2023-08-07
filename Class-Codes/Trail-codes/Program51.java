// passwordc checker 
class PasswordChecker{
	static int CheckPassword(char str[],int n){
		if(n<4){
			return 0;
		}
		if(str[0]>= '0' && str[0]<= '9'){
			return 0;
		}

		 boolean hasNumericDigits = false;
	         boolean hasCapitalLetter = false;

		for(int i=0;i<n;i++){
			char c = str[i];

			if(c>='0' && c<='9'){
				hasNumericDigits = true;
			}
			else if(c>= 'A' && c<= 'Z'){
				hasCapitalLetter = true;
			}

			if(c == ' ' || c == '/'){
				return 0;
			}
		}

		if(hasNumericDigits && hasCapitalLetter){
			return 1;
		}
		else{
			return 0;
		}
	}
	public static void main(String[] args){

		char password[] = {'a','A','1','_','6','7'};
		int result = CheckPassword(password,password.length);
		System.out.println("output:" + result);
	}
}
