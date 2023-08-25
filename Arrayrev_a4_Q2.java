import java.util.*;
public class Arrayrev_a4_Q2{
    public static void main(String[] args) {
        System.out.println(" Enter the num of terms of arrays:");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        
        int[] a = new int[n];
        int rev;

       System.out.println(" Enter the elements of array: ");
        for(int i=0; i<n;i++)
         a[i]= sc.nextInt();
      System.out.println("Reverse series");
         for(int i=n-1; i>=0; i--){
              rev=a[i];
        
       System.out.print(rev+" ");  
   } 
}
}