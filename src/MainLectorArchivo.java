import java.util.*;
import java.io.IOException;

public class MainLectorArchivo {

	public static final String DENOMINACIONES = "C:\\Users\\Daniel\\Documents\\TpNCR\\src\\denominaciones.txt";
	public static final String DENOMINACIONES_CON_NIVEL = "C:\\Users\\Daniel\\Documents\\TpNCR\\src\\denominaciones_nivel.txt";
	public static final String DENOMINACIONES_CON_MONEDAS = "C:\\Users\\Daniel\\Documents\\TpNCR\\src\\denominaciones_monedas.txt";
	
	public static void main(String[] args)
	{
		try 
		{
			probarLectorArchivo();
			probarLectorArchivoConNivel();
			probarLectorArchivoConMonedas();
		} 
		catch (NumberFormatException | IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void probarLectorArchivo() throws NumberFormatException, IOException
	{
		LectorArchivo lector = new LectorArchivo();
		List<Denominacion> denominaciones = lector.leerArchivo(DENOMINACIONES);
		System.out.println("Denominaciones\n" + denominaciones);
	}
	
	public static void probarLectorArchivoConNivel() throws NumberFormatException, IOException
	{
		LectorArchivo lector = new LectorArchivoConNivel();
		List<Denominacion> denominaciones = lector.leerArchivo(DENOMINACIONES_CON_NIVEL);
		System.out.println("Denominaciones\n" + denominaciones);
	}
	
	public static void probarLectorArchivoConMonedas() throws NumberFormatException, IOException
	{
		LectorArchivo lector = new LectorArchivoConMonedas();
		List<Denominacion> denominaciones = lector.leerArchivo(DENOMINACIONES_CON_MONEDAS);
		System.out.println("Denominaciones\n" + denominaciones);
	}

	
}
