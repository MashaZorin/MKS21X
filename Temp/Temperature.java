public class Temperature{
    public static double CtoF(double celsius){
	return celsius * 9 / 5 + 32;
    }

    public static double FtoC(double fahrenheit){
	return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[]args){
	System.out.println(CtoF(-40.0));
	System.out.println(FtoC(-40.0));
	System.out.println(CtoF(100.0));
	System.out.println(FtoC(212.0));
    }
}
