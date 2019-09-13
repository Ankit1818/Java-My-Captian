import java.util.Scanner;
public class Javaexcercise {
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str1 = in.nextLine();
 
        System.out.print("Number of  Vowels in the string: " + countVowels(str1)+"\n");
    }
 public static int countVowels(String str1)
    {
        int count = 0;
        for (int i = 0; i < str1.length(); i++)
        {
            if (str1.charAt(i) == 'a' || str1.charAt(i) == 'e' || str1.charAt(i) == 'i'
                    || str1.charAt(i) == 'o' || str1.charAt(i) == 'u')
            {
                count++;
            }
        }
        return count;
    }
}