public class Main{
		//System.out.println("");
	public static void main (String [] args){
		int cE=0,cG=0,cM=0,cP=0,flag=0;
		Enfermeras ListaEnfermeras []=new Enfermeras[10];
		do{
			System.out.println("\t IMSS");
	System.out.println("bienvenido a la base de datos");
		System.out.println("1) crear nuevaenfermera ");
		System.out.println("2) imprimir lista de enfermeras ");
		System.out.println("3 salir");
		String e= Wcore.leer();
		if (e.equals("1")){
			ListaEnfermeras[cE]=crearE();
		}
		if (e.equals("2")){
		imprimirE(ListaEnfermeras,cE);
		}
		if (e.equals("3")){
		flag=1;
		}
		} while (flag==0);
	}

	

public static   Enfermeras crearE(){
	System.out.println("Nombre completo: ");String nombre= Wcore.leer();
	System.out.println("edad: ");String ed=Wcore.leer();int edad = Wcore.conviertecadenaI(ed);
	System.out.println("Genero: ");String genero = Wcore.leer();
	System.out.println("tipo de sangre: ");String tSangre = Wcore.leer();
	System.out.println("numero de empleado: ");String ne=Wcore.leer();int nEmpleado= Wcore.conviertecadenaI(ne);
	System.out.println("Salario: ");String sa=Wcore.leer();float salario = Wcore.conviertecadenaF(sa);
	System.out.println("horas por semana: ");String h=Wcore.leer();int horas = Wcore.conviertecadenaI(h);
	System.out.println("turno: ");String turno = Wcore.leer();
	System.out.println("area: ");String area = Wcore.leer();
	Enfermeras buffer=new Enfermeras( nombre,edad , genero, tSangre, nEmpleado, salario, horas,turno, area);
	return buffer;	
} 


public static void imprimirE(Enfermeras ListaEnfermeras[],int cE){
	for (int i=0;i<=cE;i++){
	System.out.println("Nombre completo: ");
	System.out.println("edad: ");
	System.out.println("Genero: ");
	System.out.println("tipo de sangre: ");
	System.out.println("numero de empleado: ");
	System.out.println("Salario: ");
	System.out.println("horas por semana: ");
	System.out.println("turno: ");
	System.out.println("area: ");	
}
}






}