public class ExchangeVariable{
	public static void main(String ar[]){
		int n1 = 15;
		int n2 = 30;
		System.out.println("Before: n1 = "+n1+" and n2 = "+n2);
		n1 = n1 + n2;
		n2 = n1 - n2;
		n1 = n1 - n2;
		System.out.println("After: n1 = "+n1+" and n2 = "+n2);
	}
}