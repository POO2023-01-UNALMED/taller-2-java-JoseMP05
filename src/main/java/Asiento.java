package test;

public class Asiento {
	public String color;
	public int precio;
	public int registro;
	
	public void cambiarColor(String color) {
		switch (color){
			case "rojo": this.color = color; 
				break;
			case "verde": this.color = color;
				break;
			case "amarillo": this.color = color; 
				break;
			case "negro": this.color = color;
				break;
			case "blanco": this.color = color;
				break;
		}
	}
}
