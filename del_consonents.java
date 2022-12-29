import java.util.Scanner;
class del_consonents
{
  public static void main(String[] args)
  {
    String str = "Hello, have a good day";
    char ch[] = new char[20];
    int i,j=0;
    for(i=0;i<str.length();i++)
    {
       if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U') 
       {
          ch[j++] = str.charAt(i);
       }
       else
       {    
         continue;
       }
    }
    System.out.println("Sentence before deleting consonents = "+str);
    System.out.print("Sentence after deleting consonents = ");
    for(i=0;i<j;i++)
    {
      System.out.print(ch[i]);
    }
  }
}