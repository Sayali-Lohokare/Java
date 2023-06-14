class Singleton {
    static Singleton obj = new Singleton();
    private Singleton(){
        System.out.println("constructor");
    }
    static Singleton getObject(){
        return obj;

    }
    
}
class Client{
    public static void main(String[] args){

        Singleton obj1 = Singleton.getObject();
        System.out.println(obj1);
    }

}
