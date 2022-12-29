import java.util.Scanner;
class character
{
  public static void main(String[] args)
  {
    String sent;
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter any string ");
    sent = obj.nextLine();
    int i,vowels=0,conson=0,dig=0,space=0;
    char ch;
    for(i=0;i<sent.length();i++)
    {
       ch = sent.charAt(i);
       if ( (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') ) 
       {
         ch = Character.toLowerCase(ch);
         if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
           vowels++;
         else
           conson++;
       }
       else if (ch >= '0' && ch <= '9')
       {                    
         dig++;
       }      
       else if(ch == ' ')
       {
         space++;
       }
    }
    System.out.println("Number of vowels = "+vowels+"\nNumber of consonents = "+conson+"\nNumber of digits = "+dig+"\nNumber of white spaces = "+space);   
  }
}