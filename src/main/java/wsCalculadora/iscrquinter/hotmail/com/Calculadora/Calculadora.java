package wsCalculadora.iscrquinter.hotmail.com.Calculadora;

public class Calculadora {

	public double suma(double x, double y) {
		return x + y;
	}

	public double resta(double x, double y) {
		return x-y;
	}

	public double multiplica(double x, double y) {
		return x * y;
	}

	public double divide(double x, double y) {
		if (y==0)
		{
			System.out.println("Division entre cero, no es posible dividir");
			return 0;
		}
		return x / y;
	}   
}