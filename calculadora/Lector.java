import java.io.*;
public class Lector{
	public static String lee(){
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			return read.readLine();
		}catch(Exception ex){
			Menu.Printf("ERROR de lectura!");
		}
		return "-1";
		}
	}