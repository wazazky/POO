import java.util.*;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Ave
{
public String nombre;
public String modelo;
public double peso;
public int perk;
	public Ave (String n ,String m ,double p, int pk)
	{
	 nombre=n;
	 modelo=m;
	 peso=p;
	 perk=pk;
	}
	public static void main (String [] args )
	{
		Scanner s=new Scanner(System.in);
		System.out.println((char)27 + "[34;43m Ejemplo de texto azul y fondo amarillo");
		Ave ave1=new Ave ("rojo","(|°)>",10,1);
		Ave ave2=new Ave ("azul","[¬w*]>",10,2);
		Ave ave3=new Ave ("amarillo","(/M/)>",10 ,3);
		Ave ave4=new Ave ("negro","(W°M°W)",10 ,4);
		Ave ave5=new Ave ("Amazul","(¬>¬)",10 ,5);
		System.out.println("Bienvenido");
	int a;
	do
		{
			System.out.println(ave1.mostrarModelo());
			System.out.println("1 "+ave1.mostrarNombre());
			System.out.println(ave2.mostrarModelo());
			System.out.println(" 2 "+ave2.mostrarNombre());		
			System.out.println( ave3.mostrarModelo());
			System.out.println("3 "+ave3.mostrarNombre());
			System.out.println(ave4.mostrarModelo());
			System.out.println(" 4 "+ave4.mostrarNombre());
			System.out.println(ave5.mostrarModelo());
			System.out.println(" 5 "+ave5.mostrarNombre());
			System.out.println(" 6; salir");
			System.out.println("Seleccione un Ave");
			int b = Integer.parseInt(s.nextLine());
			a=b;
			if (b==1)ave1.juego();
			if (b==2)ave2.juego();		
			if (b==3)ave3.juego();		
			if (b==4)ave4.juego();		
			if (b==5)ave5.juego();		
			if (b==6)System.out.println("hasta la proxima");		
		}while (a<6);
	}
	public int juego()
	{
		
		double g=9.81,e ,flag=0, tol,p=200;
		tol=25;
		Scanner s=new Scanner(System.in);
		Random rand = new Random();
		System.out.println("un nuevo pajaro ha entrado al campo de batalla \n");
		System.out.println(nombre);
		System.out.println(modelo);
		System.out.println("\n\n");
		int target =rand.nextInt(911);
		System.out.println("el puerco esta en "+target+"m");
		//System.out.println(Math.sin(2*target) );
		System.out.println("\n\n");
		//////////////////////////////////////////////////////////////
		if (perk==1)
		{
			tol=50;
				System.out.println("Tu habilidad es tener mas rango de caida (+50m)\n");
		}
		if (perk==2)
		{
				System.out.println("Tu habilidad es tener 3 oportunidades gratis \n");
			p=p+45;
		}
		if (perk==3)
		{
			tol=15;p=p+75;
				System.out.println("Tu habilidad es mayor puntaje a cambio de menos rango de caida");
		}
		if (perk==4)
		{
			p=-50;
				System.out.println("Tu habilidad es tener mas rango de caida (+150)pero (-50)de pontaje final\n");
		}
		if (perk==5)
		{
			tol=250;
			p=p-100;
				System.out.println("Tu habilidad es Tactical nuke a costa de 75 putos , rango de caida (500m)");
		}
		///////////////////////////////////////////////////////////////
		do
		{
			System.out.println("determine la potencia");
			double  v= Double.parseDouble(s.nextLine());
			System.out.println("con que angulo");
			double  angulo = Double.parseDouble(s.nextLine());
	        e= (v*v*Math.sin(2*angulo)/g);
			if (e<0)
			{
				e=e*-1;
			}
				System.out.println("\n Parajaro en el aire              " +modelo);
				sonido("resortera.wav",4000);
				System.out.println("la distancia recorrida es "+e+"m"); 
				System.out.println("tu puntaje actual es  "+p);
			if (e>target)
			{
				System.out.println("un poco lejos\n");
				System.out.println("el puerco esta en "+target+"m\n");
			}
			if (e<target)
			{
				System.out.println("un poco cerca\n");
				System.out.println("el puerco esta en "+target+"m\n");
			}
			if (e<target+tol && e>target-tol)
			{
				sonido("golpe.wav",1000);
				System.out.println("pero estuviste cerca para hacerle daño al cerdo");
				System.out.println("has ganado\n");
				System.out.println("tu puntaje es "+p);
				sonido("ganar.wav",7000);
				flag=1;	
			}		
			p=p-15;
			if (p<0)
			{	System.out.println("has perdido");
				System.out.println("tu puntaje es "+p);			
				flag=1;	
				sonido("perder.wav",7000);				
			}
		}while (flag<1);
	return 0;
	}
	public String  mostrarNombre()
 {
	return nombre;
 }
 public String mostrarModelo()
 {
	 return modelo;
 }
 
	public void sonido(String direccion,int temp)
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
	
}