

//real time example

class IPL{
    void MatchInfo(String team1, String team2){
        System.out.println(team1 + "vs" + team2);
    }
    void MatchInfo(String team1 , String team2, String Venue){
        System.out.println(team1 + "vs" + team2);
        System.out.println("Venue =" + Venue);
    }
}
class Client{
    public static void main(String[] args){
        IPL obj = new IPL();
        obj.MatchInfo("CSK","GT");
        obj.MatchInfo("CSK", "GT", "NMSA");
    }
}


