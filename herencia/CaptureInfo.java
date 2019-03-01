import java.util.Scanner;
import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

public class CaptureInfo
{
    //Metodo de capturar atributos cadenas: nombre, id number, social number de una persona
    public static String captureStrings(String msg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("" + msg + ": " ); 
        return sc.nextLine();
    }//Fin del metodo

    //Metodo de capturar edad de una persona
    public static int captureAge(String msg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("" + msg + ": " ); 
        return sc.nextInt();
    }// fin del metodo

    //Metodo de capturar promedio
    public static double caputureGrade(String msg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("" + msg + ": " ); 
        return sc.nextDouble();
    }

}// fin de la clase 