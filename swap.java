import java.util.*;

public class swap {

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
         System.out.println("Enter the first number");
         int a=sc.nextInt();

         System.out.println("Enter the second number");
         int b=sc.nextInt();

         System.out.println("The number before Swaping are");
         System.out.println(a+","+b);

         int t;
         t=a;
         a=b;
         b=t;

         System.out.println("The number after Swaping are");
         System.out.println(a+","+b);

    }
    
}
