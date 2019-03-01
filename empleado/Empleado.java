
public class Empleado {

	//Atributos
    /**
     * Nombre del empleado
     */
    private String nombre;
    /**
     * Apellido del empleado
     */
    private String apellido;
    /**
     * Edad del empleado
     */
    private int edad;
    /**
     * Salario del empleado
     */
    private double salario;
 /**
 * Cantidad de empleados 
 */
 private static int cantidadEmpleados=0;
    /**
     * Devuelve el nombre del empleado
     * @return nombre del empleado
     */
    public String getNombre() {
        return nombre;
    }
 
    /**
     * Modifica el nombre de un empleado
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
    /**
     * Devuelve la edad de un empleado
     * @return edad del empleado
     */
    public int getEdad() {
        return edad;
    }
 
    /**
     * Modifica la edad de un empleado
     * @param edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
 
    /**
     * Devuelve el salario de un empleado
     * @return salario del empleado
     */
    public double getSalario() {
        return salario;
    }
 
         /**
     * Suma un plus al salario del empleado si el empleado tiene mas de 40 años
     * @param sueldoPlus
     */
    public boolean plus (double sueldoPlus){
        boolean aumento=false;
        if (edad>40 && compruebaNombre()){
            salario+=sueldoPlus;
            aumento=true;
        }
        return aumento;
    }
 
    //Metodos privados 
    private boolean compruebaNombre(){
        if(nombre.equals("")){
            return false;
        }
        return true;
    }
 
    //Constructor
         public Empleado(){
        this.nombre="";
        this.apellido="";
        this.edad=0;
        this.salario=0;
		this.cantidadEmpleados++;
    }

    public Empleado(String nombre, String apellido, int edad, double salario){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.salario=salario;
		this.cantidadEmpleados++;
    }
	
	public static  int getCe(){
		return cantidadEmpleados;
	}
}
