/*4. Modele el objeto que representa la cuenta de un banco, con identificador, nombre
y balance. Considere los getters, setters y constructores necesarios. Tenga en
cuenta los siguientes metodos.
a. El metodo credito que representa un deposito de dinero en la cuenta. Este
m�todo debe devolver el balance luego de la operaci�n.
b. El metodo debito que representa una sustraccion de dinero de la cuenta.
Este metodo debe devolver el balance luego de la operaci�n. Si el dinero en
la cuenta no es suficiente para cubrir la sustraccion, se debe imprimir por
pantalla un aviso.
c. Un metodo que imprima por pantalla las caracteristicas del objeto.
Realice las siguientes operaciones:
1. Inicialice una cuenta con un monto inicial de 15000.
2. Realice una operacion de credito de 2500.
3. Realice una operacion de compra de 1500.
4. Realice una operaci�n de compra de 30000.
5. Imprima por pantalla los valores de la cuenta y verifique que el balance sea
correcto.*/

public class CuentaBanco {
	
	private String identificador;
	private String nombre;	
	private double balance;
	
	public void setIdentificador(String identificador) {this.identificador = identificador;}
	public String getIdentificador() {return this.identificador;}
	
	public void setNombre(String nombre) {this.nombre = nombre;}
	public String getNombre() {return this.nombre;}
	
	public void setBalace(double balance) {this.balance = balance;}
	public double getBalance() {return this.balance;}
	
	public CuentaBanco(String nombre,String identificador,double balance) {
		this.setBalace(balance);
		this.setIdentificador(identificador);
		this.setNombre(nombre);
	}
	
	public double credito(double dinero) {
		this.balance = this.getBalance() + dinero;
		return this.getBalance();
	}
	
	public double debito(double sustraccion) {		
		if(this.getBalance() > sustraccion) {
			this.balance = this.getBalance() - sustraccion;	
		}
		else{
			System.out.println("La sustraccion desea NO fue exitosa porque no cuenta con dinero suficiente en la cuenta. Intente nuevamente.");
		}		
		return this.getBalance();
	}
	
	public String imprimirDatos() {
		return "Nombre: "+ this.getNombre()+" Identificador: "+ this.getIdentificador()+
				" Balance: "+ this.getBalance();
	}	
}