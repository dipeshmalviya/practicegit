//4.WAP to read array length and elements from user and display only even numbers from that array.
import java.util.Scanner;

public class Q4
{
 public static void main(String []args)
 {
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter the length of array : ");
   int length = sc.nextInt();
   
   
   int []arr = new int[length];
   
 
   for(int i = 0; i < length ; i++)
   {
     System.out.print("Enter value : ");
     int val = sc.nextInt();
     arr[i] = val;
   }

   for(int i = 0; i < length ; i++)
   {
      if(arr[i] % 2 == 0 )
      {
        System.out.print(arr[i] +" ");
      }
   }
  
   
  }
}