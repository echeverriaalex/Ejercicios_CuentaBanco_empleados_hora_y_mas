
public class Main {

	public static void main(String[] args) {
		
		System.out.println("\nEjercicio 1: Rectangulo");
		Rectangulo r = new Rectangulo(4, 5);
		System.out.println("\nLos datos del Rectangulo 1 son: " + r.ImprimirDatos());
		System.out.println("Su area es: " + r.CalcularArea() + " y su perimetro es: " + r.CalcularPerimetro());
		r.SetAlto(8);
		r.SetAncho(9);
		System.out.println("Ahora su area es: "+r.CalcularArea()+" y su perimetro es: "+r.CalcularPerimetro());
		Rectangulo r2 = new Rectangulo();
		System.out.println("Rectangulo 2 su area es: " + r2.CalcularArea() + 
							" y su perimetro es: " + r2.CalcularPerimetro());
		
		
		System.out.println("\n\nEjercicio 2: Empleados");
		Empleado e = new Empleado("Carlos", "Gutierrez", 25000, 23456345);		
		Empleado e2 = new Empleado("Ana", "Sanchez",27500,34234123);		
		System.out.println(e.ImprimirDatos());
		System.out.println(e2.ImprimirDatos());
		e.AumentarSalrio(15);
		System.out.println(e.ImprimirDatos());
		System.out.println("El salario anual de "+e.GetNombre()+" es "+e.CalcularSalarioAnual());
		
		
		System.out.println("\n\nEjercicio 3: Item de Ventas");
		Item i = new Item("Monitor", 6, "qwerty12345", 10500);
		System.out.println(i.Imprimir());
		
		
		System.out.println("\n\nEjercicio 4: Cuenta de un banco");
		CuentaBanco c = new CuentaBanco("Alex Echeverria", "40885197", 15000);
		System.out.println("Balance: " + c.credito(2500));
		System.out.println("Balance: " + c.debito(1500));
		System.out.println("Balance: " + c.debito(30000));
		System.out.println(c.imprimirDatos());
		
		
		System.out.println("\n\nEjercicio 5: Hora");
		Hora h = new Hora(9, 34, 50);
		System.out.println(h.imprimirHora());			
		for(int a=0;  a< 100; a++) {				
			h.Avance();
			System.out.println(h.imprimirHora());					
		}
		
		
		// imprimo la direccion de memoria del objeto
		System.out.println(r);
	}
}