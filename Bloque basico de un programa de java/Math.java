class Math{
	
public float suma(String n1, String n2){
	float f1 = conviertecadena(n1);
	float f2 = conviertecadena(n2);
	return f1+f2;
}
public float resta(String n1, String n2){
	float f1 = conviertecadena(n1);
	float f2 = conviertecadena(n2);
	return f1-f2;
}
public float multiplicacion(String n1, String n2){
	float f1 = conviertecadena(n1);
	float f2 = conviertecadena(n2);
	return f1*f2;
}
public float division(String n1, String n2){
	float f1 = conviertecadena(n1);
	float f2 = conviertecadena(n2);
	return f1/f2;
}

public float libre(String n1, String e ,String n2)
{
	float f1 = conviertecadena(n1);
	float f2 = conviertecadena(n2);
	
	if (e.equals("+"))
	{
		return f1+f2;
		
	}if (e.equals("-"))
	{
			return f1-f2;
	}if (e.equals("/"))
	{
	return f1/f2;
	}if (e.equals("*"))
	{
		return f1*f2;	
	}
	return 0;
}

public float conviertecadena(String cadena)
{
	return Float.parseFloat(cadena);
}
}