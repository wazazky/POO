import java.io.*;

public class Main{

public static void main (String [] args){
	int tam =9;
SRA  registro [] = new SRA [tam];

// nombre, poder, nomH, equipo, clasificacion
// omega alpha beta gamma delta
 registro [0]= new SRA ("Jean Grey","Telequinesis","Pheonix","X-men","Omega");
 registro [1]= new SRA ("Erik Lehnsherr","Control del magnetismo","Magneto","X-men","Alpha");
 registro [2]= new SRA ("James Howlett ","Regeneracion","Wolverine","X-men","Beta");
 registro [3]= new SRA ("Bruce Wayne","BatGod","Batman","Liga de la Justicia","Omega");
 registro [4]= new SRA ("Clark Kent","Alienigena","Superman","Liga de la Justicia","Alpha");
 registro [5]= new SRA ("Diana Prince","Diosa del Olimpo","Wonder Woman","Liga de la Justicia","Omega");
 registro [6]= new SRA ("Anthony Edward Stark","Mente Prodigiosa","Iron Man","Vengadores","Alpha");
 registro [7]= new SRA ("Steve Rogers","Super Soldado","Capitan America","Vengadores","Alpha");
 registro [8]= new SRA ("Thor Odinson","Dios Del Trueno","Thor","Vengadores","Omega");
	
	registros(registro,tam);

}
	
	
	public static void registros(SRA registro[],int tam){
		int flag =1, j;
		do {
			
		
		System.out.println("\n\t Superhero Registration Act");
		System.out.println(" bienvenido al registro de superheroes\n");
		System.out.println("1) consultar por clasificacion ");
		System.out.println("2) consultar por Equipo de Afiliacion ");
		System.out.println("3) Ver toda la base de datos ");
		
		System.out.println(" \t (salir) ");
		String eleccion= Wcore.leer(); 
		
		if (eleccion.equals("1")){
			System.out.println("ver por clasificacion ");
				System.out.println("Omega-Alpha-Beta-Gamma-Delta");
			String eleccion1= Wcore.leer(); 
			System.out.println("\n\nBusqueda "+eleccion1+"\n");
				for (j=0;j<tam;j++)	{
					
					if (registro[j].getClasificacion().equals(eleccion1)){
					System.out.println("Nombre real: "+registro[j].getNombre());
					System.out.println("poder: "+registro[j].getPoder());
					System.out.println("nombre de heroe: "+registro[j].getNomH());
					System.out.println("equipo afiliado: "+registro[j].getEquipo());
					System.out.println("Clasificacion: "+registro[j].getClasificacion());
						System.out.println("");
						
					}
				}
			
					}
		
		if (eleccion.equals("2")){
			System.out.println("ver integrantes del equipo ");
				System.out.println("Vengadores\nX-men\nLiga de la Justicia");
			String eleccion2= Wcore.leer(); 
			System.out.println("\n\nBusqueda "+eleccion2+"\n");
			if(eleccion2.equals("Vengadores")){imprimir("V.txt");}
			if(eleccion2.equals("X-men")){imprimir ("X.txt");}
			if(eleccion2.equals("Liga de la Justicia")){imprimir ("JL.txt");}
				for (j=0;j<tam;j++)	{
					
					if (registro[j].getEquipo().equals(eleccion2)){
					System.out.println("Nombre real: "+registro[j].getNombre());
					System.out.println("poder: "+registro[j].getPoder());
					System.out.println("nombre de heroe: "+registro[j].getNomH());
					System.out.println("equipo afiliado: "+registro[j].getEquipo());
					System.out.println("Clasificacion: "+registro[j].getClasificacion());
						System.out.println("");
						
					}
				}
			
					}
		
		if (eleccion.equals("3")){
			System.out.println("Ver toda la base de datos ");
				System.out.println("");
			
			
				for (j=0;j<tam;j++)	{
					
					
					System.out.println("Nombre real: "+registro[j].getNombre());
					System.out.println("poder: "+registro[j].getPoder());
					System.out.println("nombre de heroe: "+registro[j].getNomH());
					System.out.println("equipo afiliado: "+registro[j].getEquipo());
					System.out.println("Clasificacion: "+registro[j].getClasificacion());
						System.out.println("");System.out.println("enter para continuar");
						String eleccion3= Wcore.leer(); 
					
				}
			
					}
		if (eleccion.equals("salir")){flag=0;}
		}while (flag==1);
	}
	
	public static void imprimir(String direccion){
	String texto="";
	try
{
FileReader lector=new FileReader(direccion);
BufferedReader contenido=new BufferedReader(lector);
while((texto=contenido.readLine())!=null)
{
System.out.println(texto);
}
}
catch(Exception e)
{
System.out.println("Error al leer");
}
}

	}









