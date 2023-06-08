class Parent {
    int x = 10;
    static int y =20;

    Parent(){
        System.out.println("Parent");
    }
}
class Child extends Parent{
    int x = 100;
    static int y = 200;

    Child(){
        System.out.println("Child");
    }
    void access(){
        System.out.println(super.x);
        System.out.println(super.y);
        System.out.println(this.x);
        System.out.println(this.y);

    }
}
class Client{
    public static void main(String[] args){
        Child obj = new Child();
        obj.access();
    }
}