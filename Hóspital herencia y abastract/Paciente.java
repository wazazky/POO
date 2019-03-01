public abstract class  Paciente extends Persona {

public String sintomas;
public String diagnostico;
public String historial;

	public Paciente (String nombre,int edad ,String genero,String tSangre,String sintomas,String diagnostico,String historial){
		super(nombre,edad,genero,tSangre);
		this.sintomas=sintomas;
		this.diagnostico=diagnostico;
		this.historial=historial;
	}
public void setSintomas (String sintomas){this.sintomas=sintomas;}
public void setDiagnostico (String Diasnogtico){this.diagnostico=diagnostico;}
public void setHistorial (String historial){this.historial=historial;}
public String getSintomas (){return sintomas;}
public String getDiagnostico (){return diagnostico;}
public String getHistorial (){return historial;}


}