public class EmpleadoApp{
		  public static void main (String [] args){
			  System.out.println(Empleado.getCe());
			  Empleado  p1= new Empleado("Jesus","lizarraga",21,2000);
			  Empleado  p2= new Empleado("Alberto","Rodriguez",21,2001);
			  System.out.println("nombre "+p1.getNombre()+" cantidad de empleados "+Empleado.getCe());
			
		  }






	}