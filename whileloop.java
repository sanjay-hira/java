import java.util.Scanner;

public class whileloop {
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the N digit Number ");
    int n=sc.nextInt();
    int factorial=1;
    while (n>=1) {
       factorial=factorial*n;
    
    n--;}
System.out.println(factorial);
   
  
        
    }
}
    

