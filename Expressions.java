public class Expressions
{
	public static void main(String[] args)
	{
		int a = 15;
		int b = 16;
		int c = 5;
		int d = 17;
		System.out.println((a + b)/ c);
		// 15 and 16 are added and the result is divided by 5 with quotient 6
		System.out.println(a + b / c);
		// 16 is divided by 5 with quotient 3 which is then added to 15 with
		// sum 18
		System.out.println("a) " + a*c+b); //a
		System.out.println("b) " + a%c+d/d); //b
		//System.out.println("c) " + a + 1); //c
		System.out.println("d) " + d % c); //d
		System.out.println("e) " + d / c);//e
		System.out.println("f) " + d + a / d + b);//f
		System.out.println("g) " + (d + a) / (d + b));//g
		System.out.println("h) " + Math.sqrt(a*a));//h
		System.out.println("i) " + Math.pow(a, 2));//i
		System.out.println("j) " + Math.max(a, b)); //j
	}
}