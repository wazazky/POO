public class Inhumano extends Heroe {

	public String procedencia;
	public boolean ifr; //integrante familia Real
	
	public Inhumano (String nombre,String poder,String nomH,String equipo,String clasificacion,String procedencia ,boolean ifr ){
		
		super(nombre,poder,nomH,equipo,clasificacion);
		this.procedencia=procedencia;
		this.ifr=ifr;
	}

public String getProcedencia(){return procedencia;}
public boolean getIfr(){return ifr;}
public void mostrar(){
	
	System.out.println("Nombre: "+getNombre());
	System.out.println("Poder y/o habilidad: "+getPoder());
	System.out.println("Nombre de heroe: "+getNomH());
	System.out.println("Equipo de afiliacion: "+getEquipo());
	System.out.println("Clasificacion: "+getClasificacion());
	System.out.println("Lugar de Origen: "+getProcedencia());
	System.out.println("Procedente de familia Real: "+getIfr());
	System.out.println("-------------------------------------------");
	
}
}