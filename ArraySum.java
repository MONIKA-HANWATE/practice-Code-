class ArraySum{
public static void main(String args[]){
int sum=0;
int a[]=new int[5];//declaration and instantiation
a[0]=10;//initialization
a[1]=20;
a[2]=70;
a[3]=40;
a[4]=50;


//printing array
for(int i=0;i<a.length;i++){
sum=sum+a[i];//length is the property of array
System.out.println(a[i]+" ");
}
System.out.println(sum);

}}