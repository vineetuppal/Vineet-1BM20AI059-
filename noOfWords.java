import java.util.Scanner;
class noOfWords
{
  public static void main(String[] args)
  {
    String sent;
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter any string ");
    sent = obj.nextLine();
    int count=1, i;
    for(i=0; i<sent.length()-1;i++)
    {
      if((sent.charAt(i)== ' ') && (sent.charAt(i+1) != ' '))
      {
        count++;
      }
    }
    System.out.println("Number of words in the string are "+count);
    System.out.println("Given string in uppercase is "+sent.toUpperCase());
  }
}