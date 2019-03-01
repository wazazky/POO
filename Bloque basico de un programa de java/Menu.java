class Menu{
public static void Opciones(){
	
	Printf("---Menu Principal---\n");
	Printf("    Calculadora");
	Printf(" 1.- Suma");
	Printf(" 2.- resta");
	Printf(" 3.- multiplicacion");
	Printf(" 4.- divicion");
	Printf(" 5.- libre");
	
	
	Printf(" 9.- Salir\n");
	Print(" Elige una opcion: ");
}
/*
public static String datos(){
	Print("Da un numero: ");
	String n = Lector.lee();
	return n;
}
public static String datosS(){
	Print("Da una operacion ");
	String n = Lector.lee();
	return n;
}*/
public static void Printf(String texto){
	System.out.println("\t"+texto);
}

public static void Print(String texto){
	System.out.print("\t"+texto);
}

public static void clear(){
	for (int c = 0; c < 10; c++)
		Printf("");
}
}