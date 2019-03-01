public class Test
{

public static void main (String [] args)
	{
		Cuenta cuenta1=new Cuenta();
		Cuenta cuenta2=new Cuenta("jose","123144",123124);
		Cuenta cuenta3=new Cuenta();
		
		cuenta1.asignarNombre("");
		cuenta1.asignarCuenta("1237689");
		cuenta1.depositarSaldo(12000);
		cuenta1.retirarSaldo(500);
	System.out.println(cuenta1.obtenerSaldo());
	System.out.println(cuenta1.obtenerNombre());
	System.out.println(cuenta1.obtenerCuenta());
		System.out.println("\n");
	System.out.println(cuenta2.obtenerSaldo());
	System.out.println(cuenta2.obtenerNombre());
	System.out.println(cuenta2.obtenerCuenta());
	}
}