import java.util.Scanner;
public class JavaExcercise {
 
   public static void main(String[] args)
 
{
    int i,n;
 
    System.out.print("Enter number of terms : ");
    Scanner num = new Scanner(System.in);
		    n = num.nextInt();
 
     for(i=1;i<=n;i++)
     {
     System.out.println( "cube of " +i+" is : "+(i*i*i));     
    }
 }
}