import java.util.Scanner;
public class Reverse_odd {
 public static void main(String[] args) 
 {
   Scanner obj = new Scanner(System.in);
   System.out.println("Enter any string ");
   String sent = obj.nextLine();
   System.out.println("\nAfter reversing the words in the string that have odd lengths:\n" + test(sent));
 }
 public static String test(String str) 
 {
   String[] str_words = str.split(" ");
   for (int i = 0; i < str_words.length; i++) 
   {
     if (str_words[i].length() % 2 != 0) 
     {
       StringBuilder reverser = new StringBuilder(str_words[i]);
       str_words[i] = reverser.reverse().toString();
     }
   }
   return String.join(" ", str_words);
 }
}