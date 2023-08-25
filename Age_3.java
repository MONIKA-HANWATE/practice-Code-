
import java.util.Scanner;
class Age_3{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
   System.out.println("Enter number");
   int a = sc.nextInt();
   
   if (a<=3)
   	System.out.println(a+ " Toddlers");
   else if(a<=8)
   	System.out.println(a+ " Kids");
   else if(a<=12)
   	System.out.println(a+ " Child");
   else if(a<=18)
   	System.out.println(a+ " Teens");
   else if(a<=40)
   	System.out.println(a+ " Adults");
    else if(a<=60)
   	System.out.println(a+ " Matured");
   else if(a<=75)
   	System.out.println(a+ " Seniors");
   else
   	System.out.println(a+ " Super Seniors");

}
}