package cuentabancaria;

import java.util.Date;
import java.text.SimpleDateFormat;

public class CuentaBancaria{
	private double saldo;
 
	public CuentaBancaria(double saldo){
		this.saldo = saldo;
	}
        public double ObtSaldo(){
            return this.saldo;
        }
 
	public void Deposito(Double cantidad){
            /*if(cantidad <= 0) {
	    	System.out.println("No hay dinero suficiente para hacer el depósito");
            }
            else {         */
		//Se toma el tiempo en el que se realiza el movimiento
		Date hora = new Date();         
		SimpleDateFormat formatoDeFecha = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss");         
 		//Se realiza el depósito en la cuenta
		this.saldo += cantidad;        

		//Se registra el movimiento
		System.out.println("Movimiento realizado a las " + formatoDeFecha.format(hora)) ;         
            //}
	}
 
	public void Transferencia(Double cantidad, CuentaBancaria cuentaDestino)
	{
		if(this.saldo < cantidad) {
			System.out.println("No hay fondos suficientes para la transferencia.");         
		}
		else {
			//Se toma el tiempo en el que se realiza el movimiento
			Date hora = new Date();         
			SimpleDateFormat formatoDeFecha = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss");        
 
			//Se realiza el deposito en la cuenta destino
			cuentaDestino.Deposito(cantidad);
			this.saldo -= cantidad;
 
			//Se registra el movimiento
			System.out.println("Movimiento realizado a las " + formatoDeFecha.format(hora)) ;
		}
	}
 
	public void Extraccion(Double cantidad) {
		if(this.saldo < cantidad) {
			System.out.println("No hay fondos suficientes para la extracción.");         
		}
		else {         
			//Se toma el tiempo en el que se realiza el movimiento
			Date hora = new Date();         
			SimpleDateFormat formatoDeFecha = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss");         
 
			//Se retira la cantidad de saldo de la cuenta
			this.saldo -= cantidad;         
 
			//Se registra el movimiento
			System.out.println("Movimiento realizado a las " + formatoDeFecha.format(hora)) ;
		}
	}
}
