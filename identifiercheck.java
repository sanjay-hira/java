import java.util.Scanner;

public class identifiercheck {
    public static boolean identifier(String a){
        if(!((a.charAt(0)>='a'&&a.charAt(0) <='z') || a.charAt(0)=='_' || (a.charAt(0)>='A'&& a.charAt(0)<='Z'))){
            return false;
        }
        int i=1;
        while(i<a.length()){
            if((a.charAt(i)>='a'&&a.charAt(i) <='z') || a.charAt(i)=='_' || (a.charAt(i)>='A'&& a.charAt(i)<='Z')|| ( a.charAt(i)>='0' &&  a.charAt(i)<='9')){
              
            }
            else{
                return false;
            }
            
            i++;
        }
        
        
    
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Enter a String");
        Scanner sc=new Scanner(System.in);
        String a =sc.nextLine();
        System.out.println(identifier(a));
        sc.close();
    }
}
