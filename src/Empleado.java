/*
	2. Modele el objeto Empleado que posee las siguientes caracteristicas, dni, nombre,
	apellido y salario. 
	El mismo debe contar con la posibilidad de calcular el salario anual. 
	A su vez se requiere otro metodo que permita aumentar el salario
	dependiendo del porcentaje que se le pase por parametro. Considere crear un
	m�todo que facilite imprimir por pantalla las caracteristicas del objeto de la
	siguiente forma:
	Empleado[dni=?, nombre=?, apellido=?, salario=?]
	a. Inicialice un empleado Carlos Gutierrez, con dni 23456345 y salario inicial de
	25000.
	b. Inicialice un empleado Ana Sanchez, con dni 34234123 y salario inicial de
	27500.
	c. Imprima ambos objetos por pantalla
	d. Aumente el salario del empleado Carlos en un 15% e imprima en pantalla el
	salario anual del mismo.
*/

public class Empleado {
	
	private int dni;
	private String nombre;
	private String apellido;
	private double salario;
	
	public void SetApellido(String apellido) {this.apellido = apellido;}
	public String GetApellido() {return this.apellido;}
	
	public void SetNombre(String nombre) {this.nombre = nombre;}
	public String GetNombre() {return this.nombre;}
	
	public void SetSalario(double salario) {this.salario = salario;}
	public double GetSalario() {return this.salario;}
	
	public void SetDni(int dni) {this.dni = dni;}
	public int GetDni() {return this.dni;}	
	
	public Empleado(String nombre, String apellido, double salario, int dni) {
		this.SetApellido(apellido);
		this.SetNombre(nombre);
		this.SetSalario(salario);
		this.SetDni(dni); 
	}	
	
	public Empleado() {
		this.SetApellido("");
		this.SetNombre("");
		this.SetSalario(0);
		this.SetDni(0); 
	}
	
	public double CalcularSalarioAnual() {return this.GetSalario() * 12;}
	
	public void AumentarSalrio(double porcentaje) {
		this.salario = this.GetSalario() + (this.GetSalario() * porcentaje)/100;	
	}
	
	public String ImprimirDatos() {
		return " Empleado[dni= "+ this.GetDni()+
				", nombre= "+ this.GetNombre()+
				", apellido= "+ this.GetApellido()+ 
				", salario= "+ this.GetSalario()+" ]";
	}
}