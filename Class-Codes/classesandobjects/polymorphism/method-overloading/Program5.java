class Demo {
    void fun(String str){
        System.out.println("sayali");
    }
    void fun(StringBuffer str1){
        System.out.println("lohokare");
    }
}
class Client{
    public static void main(String[] args){

        String str = null;
        StringBuffer str1 = null;

        Demo obj = new Demo();
        obj.fun("tanu");
        obj.fun(new StringBuffer("mental"));
        obj.fun(null);

    }

}
