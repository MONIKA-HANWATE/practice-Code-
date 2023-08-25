import java.util.Arrays;
class ArrayShortMethod{
	public static void main(String[] args) {
		int[] a=new int[]{11,1,25,36,10};
		Arrays.sort(a);
		System.out.println("in ascending order");
		for(int i=0; i<=a.length-1;i++){

				System.out.print(a[i]+" ");
	}
}
}