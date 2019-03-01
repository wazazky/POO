import java.util.*;
class Eq
{
public static void  main (String[] args)
{
	
	double  r=0;
	System.out.println("primer numero");
	double a = Leer();
	System.out.println("segundo numero");
	double b = Leer();
	System.out.println("tercer numero");
	double c = Leer();	
	r=E(a,b,c);
	System.out.println("el resultado es ="+r);
	r=Comp(r);
}
public static double E (double a, double b , double c)
{
	double r;
	r=(b*b)-(4*a*c);
	r=r/2;
	return r;
}

public static double Comp (double a)
{
	if (a>5)
		System.out.println("el resultado es mayor a 5");	
	if (a<5)
		System.out.println("el resultado s menor a 5"); 
	return 0;
}
public static double  Leer ()
{
	Scanner s= new Scanner (System.in);
	double a = Double.parseDouble(s.nextLine());
	return a;
	
}
}


