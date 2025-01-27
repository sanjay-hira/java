import java.util.Scanner;

public class Comment {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String Comment = sc.nextLine();
        if (Comment.startsWith("//")) {
            System.out.println("It is a //single line comment"); 
        } else if (Comment.startsWith("/*") && Comment.endsWith("*/")) {
            System.out.println("it is a multi line comment");


        } else {// not comment
            System.out.println("it is not a comment");
        }

        sc.close();
    }

}
