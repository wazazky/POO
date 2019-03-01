public class PorObjeto extends Heroe {

	public String tipo;
	public String combustible;
	
	public PorObjeto (String nombre,String poder,String nomH,String equipo,String clasificacion,String tipo ,String combustible){
			
		super(nombre,poder,nomH,equipo,clasificacion);
		this.tipo=tipo;
		this.combustible=combustible;
		
	}
	public String getTipo(){return tipo;}
	public String getCombustible(){return combustible;}
public void mostrar(){
	System.out.println("Nombre: "+getNombre());
	System.out.println("Poder y/o habilidad: "+getPoder());
	System.out.println("Nombre de heroe: "+getNomH());
	System.out.println("Equipo de afiliacion: "+getEquipo());
	System.out.println("Clasificacion: "+getClasificacion());
	System.out.println("Tipo de objeto de poder: "+getTipo());
	System.out.println("Tipo de combustible ó Fuerza vital: "+getCombustible());
		System.out.println("-------------------------------------------");
}

}