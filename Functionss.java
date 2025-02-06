
import java.util.Scanner;

public class Functionss {
    public static int SimpleInterest(int a ){
        int reversed=0;
        int num= a;
     while(a!=0){
        int b=a%10;
        reversed=reversed*10+b;
          a =a/10;
          
     }
     return reversed;
           
       }
       
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int a =sc.nextInt();
        
       int ans  = SimpleInterest(a);
    
        System.out.println("Reversed Number is :" +ans );
        sc.close();
    }
    
}
