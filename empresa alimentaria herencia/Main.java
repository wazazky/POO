public class Main{

public static void main(String[] args){
ProductoFresco a= new ProductoFresco ("Manzada","10/12",213,"11/12","Russia");
ProductoRefrigerado b=new ProductoRefrigerado("Papas","10/12",723,"125");
ProductoCongelado c =new ProductoCongelado ("Papas Fritas","10/12",468,"-3 grados centigrafdos");


a.mostrar();
b.mostrar();
c.mostrar();
}


}