public  class  Enfermeras extends Empleado{

public String area;


public Enfermeras (String nombre,int edad ,String genero,String tSangre,int nEmpleado,float salario,int horas,String turno,String area){
		super(nombre,edad,genero,tSangre,nEmpleado,salario,horas,turno);
		this.area=area;
}
public void setArea(String area){this.area=area;}
public String getArea(){return area;}
}