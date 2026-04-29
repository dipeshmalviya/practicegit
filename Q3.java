//3.WAP to read array length and elements from user and display multiplication of all the elements of the array.
import java.util.Scanner;

public class Q3
{
 public static void main(String []args)
 {
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter the length of array : ");
   int length = sc.nextInt();
   
   
   int []arr = new int[length];
   int sum = 1;
 
   for(int i = 0; i < length ; i++)
   {
     System.out.print("Enter value : ");
     int val = sc.nextInt();
     arr[i] = val;
   }

   for(int i = 0; i < length ; i++)
   {
     sum = sum * arr[i];
   }
  
   System.out.println("sum of all the element : "+sum);
  }
}