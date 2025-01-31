import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age");
        int age =sc.nextInt();

        if (age<10){
            System.out.println("Child");
        }
        else if (10<45
        age&&age<18) {
            System.out.println("Minor");
        }
        
        else{
            System.out.println("major");
        }

    }
}
