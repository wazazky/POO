import java.util.*;
import java.io.*; 
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
public class Wcore
{

	public void sonido(String direccion,int temp)//sonido 
	{
	try {
			Clip sonido = AudioSystem.getClip();
			File a = new File(direccion);
			sonido.open(AudioSystem.getAudioInputStream(a));;
			sonido.start();

			Thread.sleep(temp);
			sonido.close();
		}
		catch (Exception tipoerror) 
		{
			System.out.println("" + tipoerror);
		}
	}
	
	public static int rng(int dis)
	{
		Random rand = new Random();
		int valor = rand.nextInt(dis);
		if (valor==0)
		return valor+1;
		return valor;
	}
	
public static String leer()//String variable = Wcore.leer();
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
	
public  static void limpiar()
		{
			for(int i=1;i<15;i++)
				System.out.println("\n");
		}
	
	
	
	public static float conviertecadenaF(String cadena)
{
	return Float.parseFloat(cadena);
}

	public static int conviertecadenaI(String cadena)
{
	return Integer.parseInt(cadena);
}
}

/*
String nombre = LectorTeclado.leer();
try
		{
			num = Integer.parseInt(cadena);
			
		}catch (NumberFormatException numError)
		{
			
			System.out.println("error al convertir  a int");
			System.out.println(numError);
		}
		
*/