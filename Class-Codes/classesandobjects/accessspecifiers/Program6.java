class Network{
	static int NumofNetworklayers = 7;
	String LayerName = "Physical layer";

	void display1(){
		System.out.println(NumofNetworklayers);
		System.out.println(LayerName);
		
	}
	static void display2(){
		//System.out.println(LayerName);
		System.out.println(NumofNetworklayers);
	}
}
class Device{
	public static void main(String[] args){

		Network obj = new Network();

		obj.display1();
		obj.display2();

		System.out.println(obj.NumofNetworklayers);
		System.out.println(obj.LayerName);
	}
}

