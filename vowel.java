
//WAP to check enter character check whether it vowel or consonent
import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a chracter ");
        char c = sc.next().charAt(0);
        // switch (c) {
        // case 'a':
        // System.out.println("it is vowel");
        // break;
        // case 'e':
        // System.out.println("it is vowel");
        // break;
        // case 'i':
        // System.out.println("it is vowel");
        // break;
        // case 'o':
        // System.out.println("it is vowel");
        // break;
        // case 'u':
        // System.out.println("it is vowel");
        // break;

        // case 'A':
        // System.out.println("it is vowel");
        // break;
        // case 'E':
        // System.out.println("it is vowel");
        // break;
        // case 'I':
        // System.out.println("it is vowel");
        // break;
        // case 'O':
        // System.out.println("it is vowel");
        // break;
        // case 'U':
        // System.out.println("it is vowel");
        // break;

        // default:
        // System.out.println("it is consonent");
        // }
        switch (c) {
            case 'a':

            case 'e':

            case 'i':

            case 'o':

            case 'u':

            case 'A':

            case 'E':

            case 'I':

            case 'O':

            case 'U':
                System.out.println("it is vowel");
                break;

            default:
                System.out.println("it is consonent");
        }
    }

}