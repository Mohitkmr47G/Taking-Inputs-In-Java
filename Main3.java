
import java.util.Scanner;

public class Main3
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Physics marks");
        int p = sc.nextInt();
        
        System.out.println("Enter Chemistry marks");
        int c = sc.nextInt();
        
        System.out.println("Enter Maths marks");
        int m = sc.nextInt();
        
        int Total = p+c+m;
        System.out.println("Total Marks-" + Total);
      
        // float Percentage = Total/300*100;
        // System.out.println("Percentage:" + Percentage);
        
        int percentage = (Total / 3);
        System.out.println(percentage + "%");
        
        
        
    }
    
    
}
