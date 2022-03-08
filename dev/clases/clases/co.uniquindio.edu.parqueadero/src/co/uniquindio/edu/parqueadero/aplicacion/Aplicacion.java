package co.uniquindio.edu.parqueadero.aplicacion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import co.uniquindio.edu.parqueadero.exception.VehiculoException;
import co.uniquindio.edu.parqueadero.model.Parqueadero;
import co.uniquindio.edu.parqueadero.model.TipoVehiculo;

public class Aplicacion {


	public static void main(String[] args) {

//		Parqueadero parq = null;
//
//		// Parqueadero parqueadero = new Parqueadero("centinela", 10, 20, 20, 15);
//		Parqueadero parqueadero = new Parqueadero("centinela", 1, 1, 1, 1);
//
//		parq = parqueadero;
//
//		System.out.println(parq.crearPropietario("Carlos", "1232", "2192830"));
//
//		try {
//			parq.crearVehiculo("12m", "2012", TipoVehiculo.CARRO, "1232");
//		} catch (VehiculoException e) {
//			e.printStackTrace();
//		}
		
		try {
			System.out.println(diferenciaHoras("11:00:00","15:00:00"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static int diferenciaHoras(String hora1, String hora2) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
		Date date1 = null;
		Date date2 = null;

		date1 = format.parse(hora1);
		date2 = format.parse(hora2);

		
		int diferencia = (int) ((date2.getTime()-date1.getTime())/1000);
        int horas=0;
        horas=(int)Math.floor(diferencia/3600);
        
        if(diferencia>3600) {
            horas=(int)Math.floor(diferencia/3600);
            diferencia=diferencia-(horas*3600);
        }
        
        return horas;
	}
}
