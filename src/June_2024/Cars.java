package June_2024;

public class Cars {

    public Cars Boss(String CarName, String CarColor){
        System.out.println("Boss has "+CarName+" And its color is "+CarColor);
        return this;
    }

    public Cars Ceo(String CarName, String CarColor){
        System.out.println("Ceo has "+CarName+" And its color is "+CarColor);
        return this;
    }

    public Cars MD(String CarName, String CarColor){
        System.out.println("MD has "+CarName+" And its color is "+CarColor);
        return this;
    }
    public static void main (String[] args){

        Cars c = new Cars();
        c.Boss("Lambo", "Red").Ceo("Jaguar","Yellow").MD("BMW","Black");
    }
}
