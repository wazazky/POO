public class Mein{
	//public Inhumano (String nombre,String poder,String nomH,String equipo,String clasificacion,String procedencia ,boolean ifr )
		 // public Laboratorio (String nombre,String poder,String nomH,String equipo,String clasificacion,String lab,String Texp)
		 //public Mutante(String nombre,String poder,String nomH,String equipo,String clasificacion,String mFisica)
		 //public PorObjeto (String nombre,String poder,String nomH,String equipo,String clasificacion,String tipo ,String combustible)
public static void main(String[] args){

System.out.println("");


Inhumano InH1=new Inhumano("Clark Kent"," Súper fuerza,velocidad , invulnerabilidad casi tota","Superman","Liga de la Justicia","Alpha","Krypton",false);
Inhumano InH2=new Inhumano("Thor Odinson","Dios del Trueno","Thor","Vengadores","Omega","Asgard",true);
Inhumano InH3=new Inhumano("Albert Francis Simmons","Demonio","Spawn","...","Omega","Infierno",false);
Mutante  Mt1=new Mutante("logan howlett","Factor curativo y garras retractiles","Wolverine","X-men","Beta","esqueleto de adamantiun");
Mutante  Mt2=new Mutante("Desconocido","Capacidad para detectar y realizar un seguimiento de otros mutantes","Caliban","X-men","Beta","Albinismo Extremo");
Mutante  Mt3=new Mutante("Desconocido","Factor curativo ,Francotirador, espadachin, experto en artes marciales y explosivos.","DeadPool","X-Force","Beta","Quemaduras quimicas en todo el cuerpo");
Mutante  Mt4=new Mutante("Raven Darkholme","Metamorfosis Factor curativo acelerado","Mystique","X-men","Beta","Piel color azul ojos amarillos");
Laboratorio Lab1= new Laboratorio("Bruce Banner","Super Fuerza y resistencia","Hulk","Vengadores","Beta","Culver University","Experimentos de rayos Gamma");
Laboratorio Lab2= new Laboratorio("Steve Rogers","Fuerza,resistencia,inteligencia sobrehumana","Capitan America","Vengadores","Beta","S.H.I.E.L.D. Laboratories","Experimento suero de super soldado");
PorObjeto PO1=new PorObjeto ("Hal Jordan","Creacion de Materia expontanea","Linterna Verde","Lantern Corps","Beta","Anillo de poder","Voluntad");

InH1.mostrar();
InH2.mostrar();
InH3.mostrar();
Mt1.mostrar();
Mt2.mostrar();
Mt3.mostrar();
Lab1.mostrar();
Lab2.mostrar();
PO1.mostrar();
}

	
	




}