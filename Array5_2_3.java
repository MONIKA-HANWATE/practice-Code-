public class Array5_2_3{
      public static void main(String[] args) {
        int[] a = {1,2,3,5,4,5};
       
      
        for(int i=0; i<a.length; i++){
           int temp =0;
         for(int j=i+1; j<a.length; j++){
           // if(a[i]<a[j]) large find
          if(a[i]>a[j]){
          temp = a[i];
          a[i]=a[j];
          a[j]=temp;
        }
        }
        System.out.println(a[i]);

     } 

        System.out.println("second smallest no " +a[1]); 
   }
 }
