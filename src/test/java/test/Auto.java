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
		int contador = 0;
		for(int i = 0; i < this.asientos.length; i++) {
			if(asientos[i] != null)
				++contador;
		}
		return contador;
	}
	
	public String verificarIntegridad(){
		int registroAuto = this.registro;
		int registroMotor = motor.registro;
		int[] registroAsiento = new int[cantidadAsientos()];

		for(int i = 0; i < cantidadAsientos(); i++) {
			registroAsiento[i] = asientos[i].registro;
		}
		
		if(registroAuto == registroMotor) {
			for(int i = 0; i < cantidadAsientos(); i++) {
				if(registroAsiento[i] != 0 && registroAuto == registroAsiento[i]) continue;
				else return "Las piezas no son originales";
			}
			return "Auto original";
		}
		return "Las piezas no son originales";
	}
}