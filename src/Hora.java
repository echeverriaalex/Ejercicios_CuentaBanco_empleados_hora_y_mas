/*5. Modele el objeto Hora, teniendo en cuenta sus atributos, hora, minuto y segundo.
Tenga en cuenta el rango de valores aceptados para cada uno de estos.
a. Hora: 0 - 23
b. Minuto: 0 - 59
c. Segundo: 0 - 59
Considere el siguiente comportamiento:
1. Un metodo que imprima la hora bajo el siguiente formato hh:mm:ss
usando zero a la izquierda ejemplo 13:04:22 .
2. Un metodo que avance en 1 segundo y devuelva la instancia del objeto.
3. Un metodo que retroceda en 1 segundo y devuelva la instancia del objeto.
4. Instanciar el objeto y probar los metodos creados.*/

public class Hora {
	
	private int hora;
	private int minuto;
	private int segundo;
	
	public void setHora(int hora) {		
		if(hora <24 && hora >=0)
			this.hora = hora;
	}
	
	public void setMinuto(int minuto) {		
		if(minuto<60 && minuto>=0)
			this.minuto = minuto;
	}
	
	public void setSegundo(int segundos) { 		
		if(segundos<60 && segundos>=0)
			this.segundo=segundos;
	}
	
	public int getHora() {return this.hora;}
	public int getMinuto() {return this.minuto;}	
	public int getSegundo() {return this.segundo;}
	
	public Hora(int hora,int minuto,int segundos) {		
		this.setSegundo(segundos);
		this.setMinuto(minuto);
		this.setHora(hora);		
	}
	
	public String transformarHora() {		
		if(this.getHora()<10)
			return "0"+ this.getHora();
		else
			return ":"+ this.getMinuto();
	}
	
	public String transformarMinuto() {		
		if(this.getMinuto()<10)
			return ":0"+ this.getMinuto();	
		else
			return ":"+ this.getMinuto();
	}
	
	public String transformarSegundo() {		
		if(this.getSegundo()<10)
			return ":0" + this.getSegundo(); 
		else
			return ":"+ this.getSegundo();
	}
	
	public String imprimirHora() {		
		return this.transformarHora()+ this.transformarMinuto()+this.transformarSegundo();
	}
	
	public void Avance() {		
		int segundos = this.getSegundo() + 1;		
		if(segundos < 60) {
			this.setSegundo(segundos);
		}
		else {
			this.setSegundo(00);
			int minutos = this.getMinuto() + 1;
			if(minutos < 60 ) {
				this.setMinuto(minutos);
			}
			else {
				this.setMinuto(00);	
				int hora = this.getHora() + 1;
				if(hora < 24) {							
					this.setHora(hora);
				}
				else {
					this.setHora(00);							
				}
			}
		}
		
	}
	
	public void Retroceder() {		
		int s = this.getSegundo();	
		
		if(s < 60) 			
			this.setSegundo(s +1);
		else 
		{			
			int m = this.getMinuto();
			
			if(m < 60) 			
				this.setMinuto(m +1);
			else
			{
				int h= this.getHora();
				if(h < 24) 			
					this.setHora(h +1);
				else
				{
					this.setHora(00);
				}
			}			
		}
	}	
}