public class ProductoRefrigerado extends Producto {

public String COSA;//código del organismo de supervisión alimentaria

public ProductoRefrigerado (String nombre,String fechaC,int numLote,String COSA){
	super(nombre,fechaC,numLote);
	this.COSA=COSA;
}
public void setCOSA(String COSA){
	this.COSA=COSA;}
public String getCOSA (){
return COSA;
}
public void mostrar(){
	System.out.println("Nombre: "+getNombre());
	System.out.println("Numero de lote : "+getNumLote());
	System.out.println("Fecha de caducidad: "+getFechaC());
	System.out.println("código del organismo de supervisión alimentaria"+getCOSA());
}
}