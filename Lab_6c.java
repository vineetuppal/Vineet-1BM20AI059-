import java.util.Scanner;

public class Lab_6c {
   public static void main(String args[]){
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter the number of elements in the array: ");
      int n = scan.nextInt();
      int[] array = new int[n];
      System.out.println("Enter the elements of the array: ");
      for(int i = 0; i < n; i++){
         array[i] = scan.nextInt();
      }
      while(true){
         try{
            System.out.print("Enter the index of the elements you want to print: ");
            int index = scan.nextInt();
            System.out.println("The elements at index " + index + " is: " + array[index]);
            break;
         }
         catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index, Please enter a valid index (0 to " + (n-1) + ").");
         }
      } 
      scan.close();
   }

}