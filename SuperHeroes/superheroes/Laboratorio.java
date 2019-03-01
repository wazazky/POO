public class Laboratorio extends Heroe {

public String lab;
public String Texp;//tipo de experimento
 
 public Laboratorio (String nombre,String poder,String nomH,String equipo,String clasificacion,String lab,String Texp){
		super(nombre,poder,nomH,equipo,clasificacion);
		this.lab=lab;
		this.Texp=Texp; 
 }

	public String getLab(){return lab;}
	public String getTexp(){return Texp;}

public void mostrar(){
	System.out.println("Nombre: "+getNombre());
	System.out.println("Poder y/o habilidad: "+getPoder());
	System.out.println("Nombre de heroe: "+getNomH());
	System.out.println("Equipo de afiliacion: "+getEquipo());
	System.out.println("Clasificacion: "+getClasificacion());
	System.out.println("Laboratorio de creacion: "+getLab());
	System.out.println("Tipo de experimento: "+getTexp());
			System.out.println("-------------------------------------------");

}
}