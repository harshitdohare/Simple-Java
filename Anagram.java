import java.util.Arrays;

public class q9 {
    public static void main(String[] args) {
    
        String str1 = "Race";
        String str2 = "Care";

        // convert to lowercase and remove space.
        str1 = str1.toLowerCase().replaceAll("\\s", "");
        str2 = str2.toLowerCase().replaceAll("\\s", "");

        if (str1.length() != str2.length()) {
            System.out.println("Strings are not anagrams");
        } else {
            char[] str1a = str1.toCharArray();
            char[] str2a = str2.toCharArray();
            Arrays.sort(str1a);
            Arrays.sort(str2a);
            if (Arrays.equals(str1a, str2a)) {
                System.out.println("Strings are anagrams");
            } else {
                System.out.println("Strings are not anagrams");
            }
        }
    }
}
