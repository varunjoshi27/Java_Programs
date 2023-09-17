import java.util.*;

public class table {
    
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for the table");
        int a=sc.nextInt();
        int i;
        

        System.out.println("The table is ");
        for(i=1;i<=10;i++){
            
           System.out.println(a+"x"+i+"="+i*a);
        }
    }
}
