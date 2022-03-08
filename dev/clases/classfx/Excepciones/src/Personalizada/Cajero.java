package Personalizada;

public class Cajero {

	public static void main(String[] args) {

		Cuenta cuenta = new Cuenta();
		
		cuenta.ingresar (2000.0);
		System.out.println("saldo actual "+cuenta.getSaldo());
		
		try {
			cuenta.extraer (2500);
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
		}
		
		System.out.println("Saldo actual "+cuenta.getSaldo());
	}

}
