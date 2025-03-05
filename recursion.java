import java.util.Scanner;

public class recursion {
   public static void fact(int n){

    if(n==1){
        System.out.println(1);
        return ;
    }
    fact(n+1);
    System.out.println(n);

   }
    


    public static void main(String[] args) {
        System.out.println("Enter A Number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        fact(a);
        

    }
}

