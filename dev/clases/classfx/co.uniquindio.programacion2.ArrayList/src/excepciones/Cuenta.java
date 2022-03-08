package excepciones;

import javax.swing.JOptionPane;

public class Cuenta {

	double saldo;
	public Cuenta()
	 {
	     saldo= 0;
	}
	public void ingresar(double c)
	{
	     saldo+= c;
	}
	
	public void extraer( double valorRetiro) throws SaldoInsuficienteException  {
		
		
		if(valorRetiro > saldo){
			throw new SaldoInsuficienteException("No tiene saldo");
		}else{
			saldo = saldo - valorRetiro;
			System.out.println("el saldo es= "+saldo);
		}
	}
	
	
	
	public double getSaldo()
	{
		return saldo;
	}

	
	
}
