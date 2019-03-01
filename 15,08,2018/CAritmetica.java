import java.util.*;
class CAritmetica 
{
	public static void main (String[] args)
	{
	double resultado;
	
	Scanner s= new Scanner (System.in);
	System.out.println("primer numero ");
	double dato1 = Integer.parseInt(s.nextLine());
	System.out.println("segundo numero");
	double dato2 = Integer.parseInt(s.nextLine());
	resultado=Sumar(dato1,dato2);
	//operacion suma
	System.out.println("la suma es : "+resultado);
	}

public static double Sumar (double x , double y)
{
	double resultado;
	resultado= x+y;
	return resultado ;
	
	
}


	
	
}