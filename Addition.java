import java.util.Scanner;
class Addition{
        static int mysum(int a,int b){// using method
        int c = a+b;
        return c;
    }
    public static void main(String[] args) {
        int a=5, b=6, c;
        c= mysum(a,b);
     System.out.println("Using Method"+c);
        int i=0,j,k, sum=0, z,x,y;  

Scanner sc = new Scanner(System.in);  
System.out.print("\n Enter Number of Numbers to be Calculated: ");  
int n = sc.nextInt(); 

for(i=0;i<n;i++){  
System.out.print("Enter the number: ");  
z = sc.nextInt(); 
sum+=z;}  
System.out.println("The sum of the numbers using for loop: "+sum); 

Scanner c1 = new Scanner(System.in);  
System.out.print("\n Enter Number of Numbers to be Calculated: ");  
int p = c1.nextInt(); 
int Sum=0;
j=0;
while(j<p){  
System.out.print("Enter the number: ");  
y = c1.nextInt(); 
Sum+=y; j++;
}  
System.out.println("The sum of the numbers using while loop: "+Sum); 
int suM=0;
k=0;
Scanner s = new Scanner(System.in);  
System.out.print("\n Enter Number of Numbers to be Calculated: ");  
int m = s.nextInt(); 

do{  
System.out.print("Enter the number: ");  
x = s.nextInt(); 
suM+=x;
k++;  } while(k<m); 
System.out.println("The sum of the numbers using do while loop: "+suM);   
    }
}

     
    