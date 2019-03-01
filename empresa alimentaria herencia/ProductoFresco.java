public class ProductoFresco extends Producto{

public String fechaDenvasado;
public String paisDorigen;

public ProductoFresco(String nombre,String fechaC,int numLote,String fechaDenvasado,String paisDorigen){
super(nombre,fechaC,numLote);
this.fechaDenvasado=fechaDenvasado;
this.paisDorigen=paisDorigen;
}
public void setFechaDenvasado(String fechaDenvasado){
	this.fechaDenvasado=fechaDenvasado;
}

public void setPaisDorigen(String paisDorigen){
	this.paisDorigen=paisDorigen;
}
 public String getFechaDenvasado(){
	 return fechaDenvasado;	 
 }

 public String getPaisDorigen(){
	return paisDorigen;}
public void mostrar(){
	System.out.println("Nombre: "+getNombre());
	System.out.println("Numero de lote : "+getNumLote());
	System.out.println("Fecha de caducidad: "+getFechaC());
	System.out.println("Pais de Origen: "+getPaisDorigen());
	System.out.println("Fecha de envasasdo"+getFechaDenvasado());
}

}