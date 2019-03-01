public class ProductoCongelado extends Producto{

	public String TemperaturaR;
public ProductoCongelado(String nombre,String fechaC,int numLote,String TemperaturaR){
	super(nombre,fechaC,numLote);
	this.TemperaturaR=TemperaturaR;
	
	
}
public void setTemperaturaR(String TemperaturaR){
	this.TemperaturaR=TemperaturaR;}
public String getTemperaturaR(){
	return TemperaturaR;
	
}
public void mostrar(){
		System.out.println("Nombre: "+getNombre());
	System.out.println("Numero de lote : "+getNumLote());
	System.out.println("Fecha de caducidad: "+getFechaC());;
	System.out.println("TEmperatura congelada"+getTemperaturaR());
}
}