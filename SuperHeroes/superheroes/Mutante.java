public class Mutante extends Heroe {

	public String mFisica;
		
		public Mutante(String nombre,String poder,String nomH,String equipo,String clasificacion,String mFisica){
			
		super(nombre,poder,nomH,equipo,clasificacion);
			this.mFisica=mFisica;
		}
			public String getMFisisca(){return mFisica;}
	public void mostrar(){
	System.out.println("Nombre: "+getNombre());
	System.out.println("Poder y/o habilidad: "+getPoder());
	System.out.println("Nombre de heroe: "+getNomH());
	System.out.println("Equipo de afiliacion: "+getEquipo());
	System.out.println("Clasificacion: "+getClasificacion());
	System.out.println("Mutacion fisica y/o Rasgo distintivo: "+getMFisisca());
		System.out.println("-------------------------------------------");
	}

}