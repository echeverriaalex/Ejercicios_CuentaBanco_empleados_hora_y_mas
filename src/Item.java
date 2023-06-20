/*3. Modele el objeto item de Venta con las siguientes propiedades, identificador,
descripci�n, cantidad y precio unitario. Cree los metodos para calcular el precio
total teniendo en cuenta el precio unitario y cantidad. Un metodo que permita
imprimir por pantalla los atributos del objeto de la siguiente forma:
ItemVenta[id=?, descripci�n=?, cantidad=?, pUnitario=?, pTotal=?]
a. Inicialice el objeto con los atributos necesarios
b. Imprima por pantalla el objeto inicializado.*/

public class Item {
	
	private String identificador;
	private String descripcion;
	private double cantidad;
	private double precioU;
	
	public void setIdentificador(String i) {identificador = i;}
	public String getIdentificador() {return identificador;}
	
	public void setCantidad(double c) {cantidad = c;}
	public double getCantidad() {return cantidad;}
	
	public void setPrecio(double p) {precioU = p;}
	public double getPrecio() {return precioU;}
	
	public String getDescripcion() {return descripcion;}
	public void setDescripcion(String d) { descripcion =d;}
	
	public Item(String cripcion, double cantidad, String identificador, double precio) {		
		this.setPrecio(precio);
		this.setIdentificador(identificador);
		this.setCantidad(cantidad);
		this.setDescripcion(descripcion);
	}
	
	public Item() {		
		this.setPrecio(0);
		this.setIdentificador("");
		this.setCantidad(0);
		this.setDescripcion("");
	}
	
	public double calcularTotal() {
		 return (double) precioU * (double)cantidad;		
	}
	
	public String Imprimir() {
		return "Item de Venta[id= "+ this.getIdentificador()+", descripci�n= "+ 
				this.getDescripcion()+", cantidad= "+ this.getCantidad()+
				", precio unitario= "+ this.getPrecio()+", precio total= "+ this.calcularTotal()+" ]";
	}	
}