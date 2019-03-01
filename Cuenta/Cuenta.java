public class Cuenta 
{
	private String nombre;
	private String cuenta;
	private double saldo;
	//setters y getters 
	public void asignarNombre(String nom)
	{
		if (nom.length()==0)
		{
			System.out.println("error; debes ingresar un nombre");
		}
		else
		{
			nombre=nom;
		}
		
	}
	public String obtenerNombre()
	{
		return nombre;
	}
	public void asignarCuenta(String cc)
	{
		if (cc.length()==0)
		{
			System.out.println("error; debes ingresar una cuenta");
		}
		else
		{
			cuenta=cc ;	
		}
			
	}
	public double obtenerSaldo()
	{
		return saldo ;
	}
	public void depositarSaldo(double deposito)
	{
		if (deposito<0)
		{	
		System.out.println("error; debes ingresar saldo ");
		}
		saldo=saldo+deposito;
	}
	
	public void retirarSaldo(double retiro)
	{
	if ((saldo-retiro)<0)
	{
		System.out.println("error; saldo insuficiente ");
	}
	}
	public Cuenta (String cue,String nom,double sal)
	{
		cuenta=cue;
		nombre=nom;
		saldo=sal;
	}
	public Cuenta()
	{
	}
	public String obtenerCuenta ()
	{
		return cuenta;
	}
	
}