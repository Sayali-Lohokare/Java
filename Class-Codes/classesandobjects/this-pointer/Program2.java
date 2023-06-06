class Players {
    private int  jerNo = 0;
    private String name = null;

    Players(int jerNo, String name){
        jerNo = jerNo;
        name = name;
        System.out.println("in Constructor");
    }
    void info(){
        System.out.println(jerNo + "=" + name);
    }
}
class Client{
    public static void main(String[] args){
        Players obj1 = new Players(18, "Virat");
        obj1.info();

        Players obj2 = new Players(7, "MSD");
        obj2.info();

        Players obj3 = new Players(45, "Rohit");
        obj3.info();
    }
}



// her ans comes 0=null bcz parameters and initialization names are similar