class Add{
	
public static void main(String[] args) {
	int a = 10;
	int b = 20;
	char c = 'a';
	char d = 'b';
	String x="0100" ,y="1010";
	int b1 = Integer.parseInt(x,2);//for binary no. given 2
	int b11 = Integer.parseInt(y,2);
	System.out.println("Sum of integer ="+(a+b));
	System.out.println("Sum of Character="+(c+d));
	System.out.println("Sum of binary="+(b1+b11));
}
	
}