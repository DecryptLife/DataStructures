public class palindrome_string_rec {

    static boolean checkPalindrome(String s, int start, int end)
    {
        if( start >= end)
            return true;

        return (s.charAt(start) == s.charAt(end) && checkPalindrome(s,start+1,end-1));
    }

    public static void main(String[] args) {
        String s = "abbabba";

        int start =0;
        int end = s.length() - 1;

        if(checkPalindrome(s,start, end))
            System.out.println("The string is palindrome");
        else
            System.out.println("The string is not palindrome");
    }
}
