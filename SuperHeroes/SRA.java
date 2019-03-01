public class SRA extends Heroe{

public String nombre;
public String poder;

public SRA (String nombre,String poder,String nomH,String equipo,String clasificacion){
	super(nomH,clasificacion,equipo);
	this.nombre=nombre;
	this.poder=poder;
}

		public String getNombre(){
		return nombre;
	}
	
		public String getPoder(){
		return poder;
	}


}