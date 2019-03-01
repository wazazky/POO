public abstract class Animal {
	
	public String comida;
	public String hambriento;
	public int    limites;
	public String locacion;

	public Animal (String comida ,String hambriento,int limites,String locacion){
		this.comida=comida;
		this.hambriento=hambriento;
		this.limites=limites;
		this.locacion=locacion;
	}

public abstract void hacerRuido();
public abstract void comer();
public abstract void merodear();
}