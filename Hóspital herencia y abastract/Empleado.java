public abstract  class Empleado extends Persona{

public int nEmpleado;
public float salario;
public int horas;
public String turno;

	public Empleado (String nombre,int edad ,String genero,String tSangre,int nEmpleado,float salario,int horas,String turno){
	super(nombre,edad,genero,tSangre);
		this.nEmpleado=nEmpleado;
		this.salario=salario;
		this.horas=horas;
		this.turno=turno;
	}

public float getSalario(){return salario;}
public String getTurno(){return turno;}
public int getHoras(){return horas;}
public int getnEmpleado(){return nEmpleado;}

public void setSalario(float salario){this.salario=salario;}
public void setTurno(String turno){this.turno=turno;}
public void setHoras(int horas){this.horas=horas;}
public void setnEmpleado(int nEmpleado){this.nEmpleado=nEmpleado;}

}