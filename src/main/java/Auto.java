package test;

public class Auto {
	public String modelo;
	public int precio;
	public Asiento[] asientos;
	public String marca;
	public Motor motor;
	public int registro;
	public static int cantidadCreados;
	
	public int cantidadAsientos(){
		int asientos = this.asientos.length;
		return asientos;
	}
	
	public String verificarIntegridad(){
		int registroAuto = this.registro;
		int registroAsiento = new Asiento().registro;
		int registroMotor = new Motor().registro;
		if(registroAuto == registroAsiento && registroAsiento == registroMotor) {
			System.out.println("Auto original");
		}
		else {
			System.out.println("Las piezas no son originales");
		}
	}
}
