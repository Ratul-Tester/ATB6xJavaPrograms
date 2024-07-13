package April_2024.ex_20042024;

public class Lab040 {
    public static void main(String[] args) {
        int a = 87;
        long b = 91;
        String s1 = "KK";
        String s2 = "VV";
        System.out.println(s1+s2+a+b); //KKVV8791
        System.out.println(s1+s2+(a+b)); //KKVV178
        System.out.println(a+b+s1+s2); //178KKVV
        System.out.println(a+s1+b+s2); //87KK91VV

    }
}
