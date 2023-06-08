class Parent{
    Parent(){
        System.out.println("In PArent Constructor");
    }
    void property(){
        System.out.println("Flat,CAr,Gold");
    }
    void marry(){
        System.out.println("Vijay");
    }
}
class Child extends Parent{
        Child(){
            System.out.println("In Child Constructor");
            }
            void marry(){
                System.out.println("Vaibhav Tatvavadi");
            }
        }
class Client{
        public static void main(String[] args){
            Child obj = new Child();
            obj.property();
            obj.marry();
            }
        }
    
    
    
