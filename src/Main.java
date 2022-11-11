import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

       String test1 = "rfaoe3482";
       String test2 = "jsjsjsjsj";
       String test3 = "nieudhekl";
       String test4 = "";


        System.out.println(hasUniqueChars(test1));
        System.out.println(hasUniqueChars(test2));
        System.out.println(hasUniqueChars(test3));
        System.out.println(hasUniqueChars(test4));
    }

    public static boolean hasUniqueChars(String toTest) {
        Set<Character> set = new HashSet<>();
        for(char c : toTest.toCharArray()) {
            if(set.contains(c)) {
                return false;
            }
            set.add(c);
        }
        return true;
    }
}