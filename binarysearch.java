import java.util.Scanner;

public class binarysearch {
    public static void main(String[] args) {
        int arr[]={1,20,30,40,45,46,57,58};
        int i=0;
        int r=arr.length-1;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Target");
        int target =sc.nextInt();
        while(i<=r){
            int mid=(i+r)/2; 
            if(arr[mid]==target){
                System.out.println("Found at "+mid);
                break;
            }
            else if(arr[mid]<target){
                i=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        if(r<i){

        System.out.println("Not Found");}
    }
    
}
