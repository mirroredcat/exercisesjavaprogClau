package palindrome.model;

public class Palindrome {

    public boolean isPalindrome(String word){
        if (word.length() == 1){return false;}

        String[] arr = word.split("");
        String s = "";

        for(int i = arr.length-1; i >=0; i--){
            s += arr[i];
        }
        return word.equals(s);
    }

    public int countNumberOfPalindromes(String[] palindromes){
        int count = 0;
        for (String s: palindromes){
            if (isPalindrome(s)){count +=1;}
        }
        return count;
    }
}
