//1. WAP to read array length and elements from user and display them using for loop, while loop, for each loop and do-while loop.


import java.util.Scanner;

public class Q1
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
  
   System.out.println("Display using for loop");

   for(int i = 0; i < length ; i++)
   {
     System.out.print(arr[i] +" ");
   }

    System.out.println("\nDisplay using while loop");
   int j = 0;
   while(j < length)
   {
     System.out.print(arr[j] +" ");
     j++;
   }

   System.out.println("\nDisplay using for-each loop");

   for(int i : arr)
   {
     System.out.print(i +" ");
   }

   System.out.println("\nDisplay using do -while loop");
   int temp =0;
   do
   {
     System.out.print(arr[temp] +" ");
     temp++;
   }while(length != temp );

 
  
 }

}