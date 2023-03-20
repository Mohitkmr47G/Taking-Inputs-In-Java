
import java.util.Scanner;

public class Main
{
public static void main (String[]args)
{
Scanner sc = new Scanner(System.in);

System.out.print("Enter your name , Enter your field , Enter your roll no");
String name = sc.next();
String Field = sc.next();
int roll_no= sc.nextInt();


System.out.println("Name:" + name);
System.out.println("Intrest in Field:" + Field);
System.out.println("Roll.no:" + roll_no);


}

}