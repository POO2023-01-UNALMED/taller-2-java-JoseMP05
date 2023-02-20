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
		
		if (registroAuto == registroMotor) {
			for(int i = 0; i < asientos.length; i++) {
				int registroasiento = asientos[i].registro;
				if (registroasiento != 0) {
					if(registroasiento == registroAuto){
						return "Auto original";
					}
					else return "Las piezas no son originales";
				}
			}
		}
		return "Las piezas no son originales";
	}
}