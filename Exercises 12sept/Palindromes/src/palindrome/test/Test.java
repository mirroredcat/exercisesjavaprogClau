package palindrome.test;

import palindrome.model.Palindrome;

public class Test {
    public static void main(String[] args) {
        Palindrome p1 = new Palindrome();

        String[] palis = {"mam", "lepel", "pap", "legerregel", "null", "error", "lol", "racecar", "a"};

        for(String p : palis){
            if (p1.isPalindrome(p)){
                System.out.println(p);
            }
        }
        System.out.println(p1.countNumberOfPalindromes(palis));
    }
}
