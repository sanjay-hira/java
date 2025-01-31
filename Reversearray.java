import java.util.Arrays;

public class Reversearray {
public static void main(String[] args) {

    int [] arr ={1,2,3,4,5};



    for (int i=0;i<arr.length/2;i++){
        int t =arr[i];
        arr[i]=arr[arr.length-1-i];
        arr[arr.length-i-1]=t;
      

    }
System.out.println(Arrays.toString(arr));
}
    
}