import java.util.Scanner;

public class arra {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int size =sc.nextInt();
        int arr[]=new int[size];

        System.out.println("Enter the Elements");
        for(int i=0;i<size;i++){
         arr[i]=sc.nextInt();

        }

        System.out.println("Elements are");
        for(int i =0;i<size;i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
    
}
