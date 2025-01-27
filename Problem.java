public class Problem {

    public static int isEven(int[] arr){
        if (arr.length%2==0) {
            return 100;
        }
        else{
            return 200;
           }
   }
    
    public static void main(String[] args) {
        int[] nums={12,3,4,5,56};

        int ans=isEven(nums);
        System.out.println(ans);
    }
}
