import java.util.Scanner;

public class Test {
    public static void main(String[] args ){

        //Create an array of integers. Calculate the average of those numbers.
        int[] arr = {1,2,3,4,5,6,7};
        int i = 0;
        for (int n: arr){
            i += n;
        }
        System.out.println((double)i/arr.length);

        /*
        Create an application that:
        • Reads a language code that the user has typed in (Look for the Scanner class)
        • Displays a welcome message in the given language
        • If the language code is not recognized, display a message with multiple greetings
        Examples of input and expected result:
        “NL” : Goeiedag!
        “FR” : Bonjour!
        “EN” : Good day!
        Other : Goeiedag, bonjour and good day!
         */

        /*
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        switch(s){
            case "NL": System.out.println("Dag eh?");break;
            case "EN": System.out.println("What's up?");break;
            case "FR": System.out.println("Sorry, je ne comprend pas");break;
            default:
                System.out.println("Dag, hey en bonjour!");
        }

         */


        /*
        Create an application that:
        • greets the user with “Welcome!”
        • asks the user: would you like to be greeted again? (Y/N)
        • reads the answer and if
        - Y: welcomes the user again and repeats the question
        - N: ends the application
         */


        String message;

        do {
            System.out.println("Hello");
            System.out.println("Would you like to be greeted again? Y/N");
            Scanner sc3 = new Scanner(System.in);
            message = sc3.next();
        } while (message.equals("Y"));
    }
}
