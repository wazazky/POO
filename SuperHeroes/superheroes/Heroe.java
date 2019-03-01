public class Heroe{
public String nombre;
public String nomH;
public String clasificacion;
public String equipo;
public String poder;
	public Heroe(String nombre,String poder,String nomH,String equipo,String clasificacion){
		this.nomH=nomH;
		this.clasificacion=clasificacion;
		this.equipo=equipo;
		this.nombre=nombre;
		this.poder=poder;
	}
	public String getNomH(){
		return nomH;
	}
		public String getClasificacion(){
		return clasificacion;
	}
		public String getEquipo(){
		return equipo;
	}
		public String getNombre(){
		return nombre;
	}
	
		public String getPoder(){
		return poder;
	}
public void mostrar(){
	System.out.println(getNombre());
	System.out.println(getPoder());
	System.out.println(getNomH());
	System.out.println(getEquipo());
System.out.println(getClasificacion());
}
public static void main (String [] args){
	
	
	
}
}
	
