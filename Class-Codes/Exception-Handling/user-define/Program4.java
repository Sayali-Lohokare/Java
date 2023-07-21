import java.util.*;
class DataOverFlowException extends RuntimeException{

	DataOverFlowException(String msg){
		super(msg);
	}
}
class DataUnderFlowException extends RuntimeException{

	DataUnderFlowException(String msg){
		super(msg);
		}
}
class ExceptionDemo{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("enter int value");
		System.out.println("Note: 0<elemet<100");

		int x = sc.nextInt();

		if(x>100){
			throw new DataOverFlowException("data overflow hotoy");
		}
		if(x<0){
			throw new DataUnderFlowException("data underflow hotoy");
		}
	}
}
