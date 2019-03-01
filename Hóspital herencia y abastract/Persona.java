public abstract class Persona {

	public String nombre;
	public int edad;
	public String genero;
	public String tSangre;
	
	public Persona(String nombre,int edad ,String genero,String tSangre){
		this.nombre=nombre;
		this.edad=edad;
		this.genero=genero;
		this.tSangre=tSangre;
	}
	public void setNombre (String nombre){this.nombre=nombre;}
	public void setEdad (int edad){this.edad=edad;}
	public void setGenero (String genero){	this.genero=genero;}
	public void settSangre (String tSangre){this.tSangre=tSangre;}
	
	public String getNombre (String nombre){return nombre;}
	public int getEdad (int edad){return edad;}
	public String getGenero (String genero){return genero;}
	public String gettSangre (String tSangre){return tSangre;}
	
}