package stringsLessonHomeWork;

public class Palindrome {
    public static void main(String[] args) {
        Palindrome reverseText = new Palindrome();
        boolean success = reverseText.isPalindrome("carrace");
        System.out.println(success);
    }

    public boolean isPalindrome(String text1) {

        String text2 = "";
        int lastLetter = text1.length() - 1;
        for (int i = lastLetter; i >= 0; i--) {
            text2 = text2 + text1.charAt(i);
        }
            if (text2.equals(text1)) {
                return true;
            } else {
                return false;
            }
        }
    }












