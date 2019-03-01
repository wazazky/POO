import java.io.*; 
import java.util.*;
public class Test01
{
		public static void main (String [] args )
	{
		/*System.out.println("escribe nombre");
		String nombre = Wcore.leer();
		System.out.println("escribe rol");
		String rol = Wcore.leer();*/
	
	Player p1 = new Player ("Wazazky","tanque",100,Wcore.rng(10)*10,7,Wcore.rng(10),Wcore.rng(10),2,5,Wcore.rng(10));
	Player p2 = new Player ("Skeleton","rage",50,Wcore.rng(10)*10,5,Wcore.rng(10),Wcore.rng(10),2,5,Wcore.rng(10));
	p1.mostrarPlayer();
	p2.mostrarPlayer();
	
	pelea(p1,p2);
	
	}
	public static void pelea(Player p1  ,Player p2)
	{	 int flag=1,e ;
		
		do 
		{	
			e= Wcore.rng(10);
			System.out.println ("que desea hacer");
			System.out.println ("atacar / defender");
			String eleccion= Wcore.leer();
			if (eleccion.equals("atacar") && (e>=3))
			{
				p2.hp=p2.hp-((p1.poder*p1.fuerza)/p2.defensa+3);
				
			}
			if (eleccion.equals("atacar") && (e<=7))
			{
				p2.hp=p2.hp-((p1.poder*p1.fuerza)/p2.defensa);
			}
			
			if (e<=7 && eleccion.equals("atacar"))
			{
				p1.hp=p1.hp-((p2.poder*p2.fuerza)/p1.defensa);
				
			}
			if (e>=3 && eleccion.equals("defender"))
			{
				p1.hp=p1.hp-((p2.poder*p2.fuerza)/p1.defensa+3);
			}
			
		
			p1.mostrarEstado();
			p2.mostrarEstado();
			
			if (eleccion.equals("salir"))
					flag =0;
				
			if(p1.hp<0 )
				System.out.println("\nHas perdido");
			if (p2.hp<0)
				System.out.println("\nHas ganado");
			if(p1.hp<0 || p2.hp<0)
			{
			flag =0;
			}
			Wcore.limpiar();
		}while (flag==1);
	
	}
}