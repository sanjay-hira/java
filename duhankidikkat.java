import java.util.Arrays;

public class duhankidikkat {
    public static void main(String[] args) {
        int []arr1={1,2,3,4,5,6,7,7,8};
        int target=0;
       for(int i=0;i<arr1.length-1;i++){
            if(arr1[i]==arr1[i+1]){
                target=i;

                break;
            }
       }
       for(int i=target;i<arr1.length-1;i++){
        arr1[i]=arr1[i+1];
       }
       for(int i=0;i<arr1.length-1;i++){
        System.out.print(arr1[i]+" ");
       }
            
    

    }
    
}
