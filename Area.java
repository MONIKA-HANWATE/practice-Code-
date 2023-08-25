public class Circle{
	static Area(int radius){
	
		 int area =(3.14)*radius*radius;
		 return area;
	}
	static Circumference(int radius){
		int crcm= 2*(3.14)*radius;
	}
	public static void main(String[] args) {
	   	 int radius = Integer.parseInt(args[0]);
     int a=Circumference(radius);
     int b=Area(radius);

	   System.out.println("Area of the Rectangle :" +b);
	   System.out.println("Area of the Rectangle :" +a);
	}
}