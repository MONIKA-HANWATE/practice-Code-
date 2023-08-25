import java.util.*;
public class Array5_1{

   public static void main(String[] args){
    System.out.println(" Enter no. of element in array :");
 
    Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
          int []a=new int[n];
    System.out.println(" Enter elements :");

        for(int i=0; i<n;i++)
            a[i] = sc.nextInt(); 

     int temp=0;

     for (int i=0; i<=a.length-1;i++){   
        for(int j =1; j<=a.length-1;j++ ){
        if (a[i]==a[j])
        continue;
        else 
        temp=a[i];

       }
       System.out.print(temp);
    }
      
}
}
class Pro_5_1
{
    public static void main(String [] args)
    {
        int i,j=0;
        int[] a={1,4,4,6,7,7,8,9,10,11};
        System.out.println("Disply array element with duplicate element");
        for(i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        for(i=0;i<a.length-1;i++)
        {
            if(a[i]!=a[i+1])
            {
                a[j]=a[i];
                j++;
            }
        }
        a[j]=a[a.length-1];
        System.out.println("Display array element after remove duplicate element");
        for(i=0;i<j+1;i++)
        {
            System.out.println(a[i]);
        }
    }
}