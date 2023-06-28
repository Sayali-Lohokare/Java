class Parent {
    Parent(){
        System.out.println(this);
        System.out.println("In Parent Constructor");
    }
    void parentProperty(){
        System.out.println("Flat,Car,Gold");
    }
}
class Child extends Parent{
    Child(){
        System.out.println(this);
        System.out.println("In Child Constructor");
    }
}
class Client{
    public static void main(String[] args){
        Parent obj1 = new Parent();
        Child obj2 = new Child();
        //obj1.parentProperty();
    }
}
    

