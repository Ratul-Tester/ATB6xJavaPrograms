package April_2024.ex_20042024;

public class Lab051 {
    public static void main(String[] args) {
        String pwd = "Ratul@143";
        String pwd_u = pwd.toLowerCase();
        System.out.println(pwd_u); //ratul@143
        System.out.println(pwd==pwd_u); //False
        System.out.println(pwd.equals(pwd_u)); // False
        System.out.println(pwd.equalsIgnoreCase(pwd_u)); // True
        System.out.println(pwd_u.contains("@143")); // True
        System.out.println(pwd.substring(0,3));
        System.out.println(pwd_u.substring(0,3));
        System.out.println(pwd.indexOf("@"));


    }
}
