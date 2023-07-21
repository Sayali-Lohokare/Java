import java.util.*;
class DataOverFlowException extends RuntimeException{

	DataOverFlowException(String str){
		super(str);
	}
}
class DataUnderFlowException extends RuntimeException{

	DataUnderFlowException(String str){
		super(str);
	}
}
class Demo{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("enter int value");
		System.out.println("Note: 0<element<100");

		int x = sc.nextInt();

		try{
			if(x>100){
				throw new DataOverFlowException("data overflow hotoy");
			}
		}
		catch(DataOverFlowException dof){
			System.out.println("data is greater than 100");
		}
		try{
			if(x<0){
				throw new DataUnderFlowException("Data under flow hotoy");
			}
		}
		catch(DataUnderFlowException duf){
			System.out.println("data is smaller than 0");
		}
		}
	}



