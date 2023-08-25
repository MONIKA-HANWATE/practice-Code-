import java.util.*;
  
public class Array_index_23ass4 {
    public static void main(String[] args)
    {
        int[] a = { 1, 2, 3, 4, 5, 6, 7 };
System.out.println("number");

 Scanner scn = new Scanner(System.in);
 int num = scn.nextInt();

  for (int i=0;i<=a.length-1;i++) {
    if (a[i]==num)
        System.out.println("index no is "+i);
      
  }
        }
}