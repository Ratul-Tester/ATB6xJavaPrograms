package April_2024.ex_20042024;

public class Lab047 {
    public static void main(String[] args) {
        String s = "Hello";
        String s1 = " Guys";
        String s3 = s + s1;
        String s4 = s.concat(s1);
        String s5 = "Hello Guys";
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s5==s4);
        System.out.println(s3==s4);
    }
}
