package April_2024.ex_20042024;

public class Lab046 {
    public static void main(String[] args) {
        String s ="Ratul";
        String s1 ="Ratul";
        String s2 ="Patul";
        String s3 ="Ratul";
        System.out.println(s==s1); // Different reference or variable indicating to same value gives True
        System.out.println(s==s2); // Different reference or variable indicating different value gives False
        System.out.println(s1==s3); // Different reference or variable indicating different value gives True
    }
}
