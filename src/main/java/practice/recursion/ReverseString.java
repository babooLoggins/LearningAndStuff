package practice.recursion;

public class ReverseString {

    public static String reverse(String s){
        if(s.length() == 1){
            return s;
        } else {
            return reverse(s.substring(1)) + s.charAt(0);
        }
    }

    public static void main(String[] args){
        String a = "abc123";
        String b = "b";
        String c = "Sassafrass salad!";

        System.out.println(reverse(a));
        System.out.println(reverse(b));
        System.out.println(reverse(c));
    }
}
