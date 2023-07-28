import java.util.*;
class Solution{
	public static int plusOne(int digits[]){
		int i=digits.length;

		while(i>=0){
			if(digits[i]!=9){
				digits[i]=digits[i]+1;
				return digits[i];
			}
			digits[i]=0;
			i--;
		}
		int res[] = new int[digits.length+1];
			res[0]=1;
			return res;
		}
		public static void main(String[] args){
			int digits[]={1,2,3};
			digits=plusOne(digits);
			System.out.println(Array.toString(digits));
		}
}


