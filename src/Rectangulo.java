/*
	1. Modele el objeto Rectangulo con sus propiedades, ancho y alto. Ambas con valor 1,0 
	por defecto. 
	
	Este objeto debe exponer los getters y setters necesarios. Tambien
	debe contar con un metodo para calcular el area y perimetro del mismo. Ejecute las
	siguientes pruebas:
	a. Inicializar un objeto Rectangulo estableciendo ancho y alto.
	b. Imprimir por pantalla el alto y ancho.
	c. Imprimir por pantalla el area y perimetro.
	d. Modificar el alto y el ancho de la instancia.
	e. Imprimir por pantalla nuevamente el calculo del area y perimetro.
	f. Inicializar un objeto Rectangulo con los valores por defecto y verificar.
*/

public class Rectangulo {
	
	private double ancho = 1.0;
	private double alto = 1.0;
	
	public void SetAncho(double a) {ancho = a;}	
	public double GetAncho() {return ancho;}
	
	public void SetAlto(double a) {alto =a;}
	public double GetAlto() {return alto;}
	
	public double CalcularPerimetro() {return (2*(alto+ancho));}

	public double CalcularArea() {return (ancho*alto);}
	
	public String ImprimirDatos() {		
		return "Ancho: "+ this.GetAncho() +" y Alto: " + this.GetAlto();
	}
	
	public Rectangulo(double an, double al){
		 this.SetAncho(an);
		 this.SetAlto(al);
	}
	
	public Rectangulo(){
		this.SetAncho(1.0);
		this.SetAlto(1.0);
	}
}