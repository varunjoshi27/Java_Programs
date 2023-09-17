import java.util.*;


public class eligible {
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter your age");
         int age=sc.nextInt();
         if(age>=18){
            System.out.println("You can drive and vote");
         }
         else{
            System.out.println("You can't drive and vote");
         }
    }
}
