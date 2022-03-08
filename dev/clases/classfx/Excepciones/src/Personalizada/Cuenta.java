package Personalizada;

public class Cuenta {
	
	double saldo;
	
	public Cuenta() 
	{
		saldo= 0;
	}
	
	public void ingresar (double c) 
	{
		saldo+= c;
	}
	
	public void extraer ( double valorRetiro) throws SaldoInsuficienteException /*Propagar Excepcion*/ { 
		if (valorRetiro > this.saldo) {
			
			throw new SaldoInsuficienteException("No tiene saldo"); //Declarar Exepcion
			
		} else {
			System.out.println("El saldo es= "+this.saldo);
		}
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}	
	
}
