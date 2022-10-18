public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            System.out.print(isPalindrome(s) + " ");
        }

    }
    public static String reverseString(String Strings)
    {
        String str = "";
        for (int i = Strings.length() - 1; i>=0; i--)
        {
            str += Strings.charAt(i);
        }
        return str;
    }

    public static boolean isPalindrome(String s)
    {
        String str = reverseString(s);
        return s.equals(str);

    }

}
