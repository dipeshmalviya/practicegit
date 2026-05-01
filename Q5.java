//5. WAP to read array length and elements from user and reverse that array and display that reversed array.

import java.util.Scanner;

public class Q5
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
   int j = length -1;
   int i = 0;
   while(j > i)
   {
      int temp = arr[i];
      arr[i] = arr[j]; 
      arr[j] = temp;
      i++;
      j--;
   }

    for(int k = 0; k < length ; k++)
   {
      
      System.out.print(arr[k] +" ");
      
   }
  
   
  }
}