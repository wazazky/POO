import java.util.Scanner;

public class Menu
{    
    public static void menuOptions()
    {
        Scanner sc = new Scanner(System.in);
        do
        {
            //cls();
            System.out.println("[1] Estudiante");
            System.out.println("[2] Trabajador");
            System.out.println("[3] Jubilado");
            System.out.println("[4] Salir");
            System.out.print("Elija una opcion:");
            //sc.nextInt();
            switch (sc.nextInt())
            {
                case 1: cls(); 
                Student student = new Student(CaptureInfo.captureStrings("Nombre"), CaptureInfo.captureAge("Edad"), CaptureInfo.captureStrings("Matricula"), CaptureInfo.captureStrings("Numero de seguro social"));
                cls();
                System.out.println("Datos de la persona");
                System.out.println("Nombre: " + student.name);
                System.out.println("Edad: " + student.age);
                System.out.println("Matricula: " + student.id_Number);
                System.out.println("Seguro social: " + student.social_number);
                break; //Fin case 1
                
                case 2: cls(); 
                Worker activeWorker = new Worker(CaptureInfo.captureStrings("Nombre"), CaptureInfo.captureAge("Edad"), CaptureInfo.captureStrings("No. empleado"), CaptureInfo.captureStrings("Numero de seguro social")); 
                cls();
                System.out.println("Datos de la persona");
                System.out.println("Nombre: " + activeWorker.name);
                System.out.println("Edad: " + activeWorker.age);
                System.out.println("Numero de empleado: " + activeWorker.id_Number);
                System.out.println("Seguro social: " + activeWorker.social_number);
                break;//Fin case 2
                
                case 3: cls(); 
                Worker retireWorker = new Worker(CaptureInfo.captureStrings("Nombre"), CaptureInfo.captureAge("Edad"), CaptureInfo.captureStrings("No. jubilado"), CaptureInfo.captureStrings("Numero de seguro social "));
                cls();
                System.out.println("Datos de la persona");
                System.out.println("Nombre: " + retireWorker.name);
                System.out.println("Edad: " + retireWorker.age);
                System.out.println("Numero de empleado: " + retireWorker.id_Number);
                System.out.println("Seguro social: " + retireWorker.social_number);
                break;//Fin case 3
            }
        }while(sc.nextInt() != 4);//Se cicla hasta que presiona 4 para salir
    }// fin del metodo menu 

    //Limpia pantalla
    public static void cls()
    {
        for(int i = 0; i<50; i++)
            System.out.println("");
    }
    
}// fin de la clase