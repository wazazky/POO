/*Nombre: Juego del Ahorcado
Tema: Clase String

Haciendo uso de la clase String se va a implementar el juego 
del ahorcado con las siguientes especificaciones: 

La Clase JuegoAhorcado debe incluir:
El constructor tendrá como primer parámetro el número de vidas
 y como segundo parámetro la cadena a adivinar.
Método Juega.
Método ReiniciarPartida.
Crear una cadena del mismo tamaño que la cadena a adivinar
 pero en la que todos sus caracteres sean un '-'.
Mostrar al usuario la cadena con los '-'.
Pedir al usuario que introduzca un carácter y comprobar
 si está en la cadena a adivinar.
Si está en la cadena, reemplazar los '-' por el carácter en las posiciones
 que corresponda. Comparar esta cadena con la cadena a adivinar y, si son 
 iguales, indicarselo al usuario y terminar la partida.
Si no está en la cadena, llamar al método QuitarVida comprobando si se ha 
terminado la partida o no. Si no se ha terminado la partida, volver a mostrar 
la cadena con '-' al usuario y repetir el proceso.
*/ 
import java.util.*;
import java.io.*; 

public class Ahorcado{
	

	public String clave;
	public int vidas;
	 
	
	public  /*static*/ void ReiniciarPartida(){
		
		System.out.println("quiere salir si / no :");
			String s = leer();
			if (s.equals("si")){
				System.exit(0);
			}
		
		System.out.println("escribe la nueva frase a encontrar");
		String c= leer();
		Ahorcado intento = new Ahorcado (c,5);
		for (int q=0;q<70;q++){
			System.out.println("");
		}
			System.out.println("encuentra la nueva palabra");
			intento.juega();
	}
	
	public  void Quitarvida(){
		vidas--;
	}
	
	
	
	
	public  void juega (){
	
	char[] claveOculta = claveO();
	Scanner variable =new Scanner (System.in);
	ArrayList<Character> buff=new ArrayList<Character>();
		 while(vidas>0){
		   char v=variable.next().charAt(0);
		   
		   if(buff.contains(v)){
			   System.out.println("La letra ya se ha usado");
			   continue;
		   }
		   
		   buff.add(v);
		   
		   if(clave.contains(v+"")){
			   for(int y=0;y<clave.length();y++){
				   if(clave.charAt(y)==v){
					   claveOculta[y]=v;
				   }
			   }
		   } 
		else {
			Quitarvida();
		}
	   if(clave.equals(String.valueOf(claveOculta))){
		   System.out.println(claveOculta);
		   System.out.println("Ganaste!");	
		   ReiniciarPartida();
		   break;
	   }
	   System.out.print(claveOculta);
	   System.out.println("  Vidas restantes  "+vidas);
   }
       if(vidas==0){
		   System.out.println("Perdiste");
	   }

	}
	
	public  char[] claveO(){
		
		char[] claveOculta=new char [clave.length()];
		
		for (int e=0; e< clave.length();e++){
			claveOculta[e]='-';
		 if(clave.charAt(e)==' '){
			   claveOculta[e] = ' ';
		   }
		}
		
		System.out.print(claveOculta);	
		return claveOculta;
	}
	
	public static void  main (String [] args ){
	Ahorcado intento = new Ahorcado ("qwerty",5);
	intento.juega();
	}
	
	 public Ahorcado(String clave,int vidas){
		 this.clave = clave ;
		 this.vidas = vidas;
	 }

	public static String leer()
	{
		String lectura = new String();
		InputStreamReader lectroTeclado = new InputStreamReader (System.in);
		BufferedReader buffer =new BufferedReader(lectroTeclado);
		try 
		{
			lectura = buffer.readLine();
		}catch (IOException IOerror){
			System.out.println("Error al leer el teclado");
			System.out.println(IOerror);
		}
		return lectura;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}