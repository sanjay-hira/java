public class Arrays {
    public static void main(String[] args) {
        
    int [] Arr = new int[3];
    Arr [0] = 1;
    Arr [1] = 2;
    Arr [2] =3;
    System.out.println(Arr[0]);
    System.out.println(Arr[1]);
       int sum=0;
    for(int k = 0; k < Arr.length ;k++){
        sum = sum + Arr[k];

    }
    System.out.println(sum);
    
    }
}
