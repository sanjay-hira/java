import java.util.ArrayList;

public class newlistarray {
    public static void main(String[] args) {
        
        ArrayList<Integer>list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        
        System.out.println("Arraylist is");
        System.out.println(list1);

        System.out.println("reversed Array is");
        int j=0;
        int k=list1.size()-1;
        while(j<k){
            Integer temp=Integer.valueOf(list1.get(j));
            list1.set(j, list1.get(k));
            list1.set(k, temp);
            j++;
            k--;
        }
System.out.println(list1);
    }
    
    
}
