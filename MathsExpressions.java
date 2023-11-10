public class MathsExpressions{
	public static void main(String ar[]){
		int a = 2;
		int b = 4;
		int c = 8;
		int d = 16;
		
		int first = ((a*a)+(b*b)+(c*c)) / d;
		double second = Math.sqrt((b*b) - (4*a*c));
		int third = (a+b) * (c+d);
		
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
	}
}