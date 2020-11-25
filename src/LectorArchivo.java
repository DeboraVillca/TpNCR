

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class LectorArchivo
{
	protected List<Denominacion> denominaciones;
	
	public List<Denominacion> leerArchivo(String path) throws NumberFormatException, IOException 
	{
		FileReader archivo = new FileReader(path);
		BufferedReader lector = new BufferedReader(archivo);
		
		denominaciones = new ArrayList<Denominacion>();
		String linea;
		
		while((linea = lector.readLine())!= null)
		{
			String[] arregloDenominaciones = linea.split(",");
			for(int i = 0; i < arregloDenominaciones.length; i++) 
			{
				agregarDenominacion(arregloDenominaciones[i]);
			}
		}
		
		lector.close();
		
		return denominaciones;
	}
	
	public void agregarDenominacion(String linea)
	{
		denominaciones.add(new Denominacion(Integer.parseInt(linea)));
	}

}