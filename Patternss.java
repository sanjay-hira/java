import java.util.Scanner;

public class Patternss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number :");
        int n=sc.nextInt();

        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }System.out.println("");
        }

sc.close();
    }

}
