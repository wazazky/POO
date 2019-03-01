public class Producto {
	 
	 public String fechaC;
	 public int numLote;
	 public String nombre;
	 
public Producto(String nombre,String fechaC,int numLote){
	this.nombre=nombre;
	this.fechaC=fechaC;
	this.numLote=numLote;
}

public void mostrar(){
	System.out.println("Nombre: "+getNombre());
	System.out.println("Numero de lote : "+getNumLote());
	System.out.println("Fecha de caducidad: "+getFechaC());
}
public void setNombre(String nombre){
	this.nombre=nombre;}
public String getNombre (){
return nombre;
}
public void setNumLote(int numLote){
		this.numLote=numLote;}
public int getNumLote (){
return numLote;
}
public void setFechaC(String fechaC){
	this.fechaC=fechaC;}
public String getFechaC (){
return fechaC;
}

}