import java.io.*; 

public class Player
{
	public String  nombre;
	public String  rol;
	public double hp;
	public double mp;
	public double fuerza;
	public double velocidad;
	public double inteligencia;
	public double poder;	
	public double defensa;
	public double suerte;

	public Player (String n,String r,double h,double m,double f,double v,double i,double p,double d,double s)//constructor
	{
	nombre=n;
	rol=r;
	hp=h;
	mp=m;
	fuerza=f;
	velocidad=v;
	inteligencia=i;
	poder=p;	
	defensa=d;
	suerte=s;
	}
	public  void mostrarPlayer()
	{
		System.out.println("\nnombre; "+nombre);
		System.out.println("rol ;"+rol);
		System.out.println("puntos de vida; "+hp);
		System.out.println("Puntos de magia; "+mp);
		System.out.println("fuerza; "+fuerza);
		System.out.println("velocidad; "+velocidad);
		System.out.println("inteligencia; "+inteligencia);
		System.out.println("poder; "+poder);
		System.out.println("defensa; "+defensa);
		System.out.println("suerte; "+suerte);
	}
	public void mostrarEstado()
	{
		System.out.println("\nnombre; "+nombre);
		System.out.println("puntos de vida; "+hp);
		System.out.println("Puntos de magia; "+mp);
		System.out.println("fuerza; "+fuerza);
		System.out.println("poder; "+poder);
		System.out.println("defensa; "+defensa);
	}
}
