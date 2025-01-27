import java.util.Scanner;
public class Example{
    
    public static void main(String[] args) {
     /*  int x=7;
       int y=8;
       System.out.println(x+y);*/

       try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter Radius : ");
         int radius = sc.nextInt();
         double area=radius * radius;
         System.out.println("area of circle is"+area );
      }

    }}