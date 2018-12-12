package cuentabancaria_aspecto;
//Implementacion de un aspecto que permita registrar el tiempo en el que se realizan movimientos en una cuenta
public class CuentaBancaria{
	private double saldo;
 
	public CuentaBancaria(double saldo){
		this.saldo = saldo;
	}
        public double ObtSaldo(){
            return this.saldo;
        }
 
	public void hacerDeposito(Double cantidad){
            /*if(cantidad <= 0) {
		System.out.println("No hay dinero suficiente para hacer el depósito");
            }
            else { */
		//Se realiza el depósito en la cuenta
		this.saldo += cantidad;
            //}
	}
 
	public void hacerTransferencia(Double cantidad, CuentaBancaria cuentaDestino){
            if(this.saldo < cantidad) {
		System.out.println("No hay fondos suficientes para la transferencia.");         
            }
            else {
		//Se realiza el deposito en la cuenta destino
		cuentaDestino.hacerDeposito(cantidad);
		this.saldo -= cantidad;
            }
	}
 
	public void hacerExtraccion(Double cantidad){
            if(this.saldo < cantidad) {
		System.out.println("No hay fondos suficientes para la extracción.");         
            }
            else {
		//Se retira la cantidad de saldo de la cuenta
		this.saldo -= cantidad;
            }
	}
}