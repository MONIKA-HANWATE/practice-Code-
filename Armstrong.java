import java.util.Scanner;
class Armstrong{
    public static void main(String[] args) {
        
    int i, r, cube = 0;
    Scanner sc = new Scanner(System.in);
   System.out.println("Enter number");
   int a = sc.nextInt();
    i = a;
    for (i=a;i != 0;) {
        r = i % 10;
       cube += r * r * r;
       i /= 10;
    }

    if (cube == a)
   System.out.println(+a+ " is an Armstrong number.");
    else
        System.out.println(+a+ " is not an Armstrong number.");

}
}