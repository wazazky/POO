public  class Medicos extends Empleado{

	public int cedula;
	
	public Medicos(String nombre,int edad ,String genero,String tSangre,int nEmpleado,float salario,int horas,String turno,int cedula){
		super(nombre,edad,genero,tSangre,nEmpleado,salario,horas,turno);
		this.cedula=cedula;
	}
	
public void setCedula(int cedula){this.cedula=cedula;}
public int getCedula(){return cedula;}




}