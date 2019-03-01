public class Calculadora{
public static void main(String[] args){
	try{
	    boolean salir = false;
	    while(!salir)
	    {
	    	Menu.Opciones();
	    	String select = args[0];
	    	switch(select)
	    	    {
	    	        case "1":
	    	            Menu.clear();
	    	            Menu.Printf("Suma.");
	    	            Math suma = new Math();
	    	            float sum = suma.suma(args[1],args[2]);     
	    	            Menu.Print("Resultado: "+ sum+"\n\n");
	    	            Menu.Printf("Presiona <Enter> para continuar.");
	    	            //Lector.lee();    
	    	            Menu.clear();
					break;
					case "2":
	    	            Menu.clear();
	    	            Menu.Printf("resta ");
	    	            Math resta = new Math();
	    	            float rest = resta.resta(args[1],args[2]);     
	    	            Menu.Print("Resultado: "+ rest+"\n\n");
	    	            Menu.Printf("Presiona <Enter> para continuar.");
	    	            //Lector.lee();    
	    	            Menu.clear();
					break;
					case "3":
	    	            Menu.clear();
	    	            Menu.Printf("multiplicacion");
	    	            Math multiplicacion = new Math();
	    	            float multi = multiplicacion.multiplicacion(args[1],args[2]);     
	    	            Menu.Print("Resultado: "+ multi+"\n\n");
	    	            Menu.Printf("Presiona <Enter> para continuar.");
	    	            //Lector.lee();    
	    	            Menu.clear();
					break;
					case "4":
	    	            Menu.clear();
	    	            Menu.Printf("division");
	    	            Math division = new Math();
	    	            float divi = division.division(args[1],args[2]);     
	    	            Menu.Print("Resultado: "+ divi+"\n\n");
	    	            Menu.Printf("Presiona <Enter> para continuar.");
	    	            //Lector.lee();    
	    	            Menu.clear();
					break;/*
					case "5":
	    	            Menu.clear();
	    	            Menu.Printf("libre");
	    	            Math libre = new Math();
	    	            float lib = libre.libre(Menu.datos(),Menu.datosS(),Menu.datos());     
	    	            Menu.Print("Resultado: "+lib+"\n\n");
	    	            Menu.Printf("Presiona <Enter> para continuar.");
	    	           // Lector.lee();    
	    	            Menu.clear();
					break;*/
	    	        case "9":
	    	            Menu.Printf(" Presiona <Enter> para salir del programa. Adios!");
	    	           // Lector.lee();
	    	            salir = true;
	    	        break;
	    	        default:
	    	        {
	    	        	Menu.clear();
	    	            Menu.Printf("Opcion incorrecta.");
	    	            //Lector.lee();
                    }
	            }
	    }
	}catch(Exception ex){
		Menu.Printf("Error.");
	}	
}
}