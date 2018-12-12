package cuentabancaria_aspecto;

import java.util.Date;
import java.text.SimpleDateFormat;
public aspect RegistroDeMovimientos {
 
	//Se realiza un pointcut anonimo donde despues de ejecutarse cualquier metodo que empiece con "hacer"
	//registre el tiempo en que se realiza un movimiento en la cuenta
    after(): execution (public * hacer*(..)) {
		Date hora = new Date();           
		SimpleDateFormat formatoDeFecha = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss");
		System.out.println("Movimiento realizado a las " + formatoDeFecha.format(hora)) ;
	}
}
