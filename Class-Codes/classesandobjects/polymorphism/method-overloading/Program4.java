class Demo {
    void fun(int x, float y){
        System.out.println("int-float para");
    }
    void fun(float x, int y){
        System.out.println("float-int para");
    }
}
class Client{
    public static void main(String[] args){

        Demo obj = new Demo();
        Demo.fun(10,10);

        
    }
}
