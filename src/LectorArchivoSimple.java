import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LectorArchivoSimple implements ILectorArchivo {

	@Override
	public List<IDenominacion> leerArchivo(String path) throws NumberFormatException, IOException {
		FileReader fr = new FileReader(path);
		BufferedReader bf = new BufferedReader(fr);
		
		List<Denominacion> nueva=new ArrayList<Denominacion>();
		
		String sCadena;
		while ((sCadena = bf.readLine())!=null) {
			String[] arreglo = sCadena.split(" ");
			for(int i=0;i<arreglo.length;i++) {
				nueva.add(new Denominacion(Integer.parseInt(arreglo[i])));
			}
		    
		}
	
		//return nueva; falta cambios 
		return null; 
	}

}
