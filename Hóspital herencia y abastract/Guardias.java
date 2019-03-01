public class Guardias extends Empleado{

public int ppa;//permiso portacion de armas 


public Guardias (String nombre,int edad ,String genero,String tSangre,int nEmpleado,float salario,int horas,String turno,int ppa){
		super(nombre,edad,genero,tSangre,nEmpleado,salario,horas,turno);
		this.ppa=ppa;
}

public void setPpa(int ppa){this.ppa=ppa;}
public int getPpa(){return ppa;}
}