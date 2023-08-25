import java.util.*;
public class Array5_12{

   public static void main(String[] args){
    System.out.println(" Enter no. of element in array :");
 
    Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
          int []a=new int[n];
    System.out.println(" Enter elements :");

        for(int i=0; i<n;i++)
            a[i] = sc.nextInt(); 

        System.out.println(" Enter elements to check :");
        
        int no1= sc.nextInt();
        int no2= sc.nextInt();

for (int i=0; i<=a.length-1 ;i++){
    if (no1==a[i])
    
    for (int j=i; j<=a.length-1 ;j++){
    if(no2==a[j])
    System.out.println("contain both element");
   
    }
}
}
}

