package excepciones;

public class Cajero {

	
	public static void main(String[] args)
	{
		Cuenta cuenta = new Cuenta();
		cuenta.ingresar(2000.0);
		
		System.out.println("Saldo actual = "+cuenta.getSaldo());
		
		
		try {
			cuenta.extraer(2500);
		} catch (SaldoInsuficienteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Saldo actual = "+cuenta.getSaldo());
		
		
		
	}

	
	
}
