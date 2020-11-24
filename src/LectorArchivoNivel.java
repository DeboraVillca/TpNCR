import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LectorArchivoNivel implements ILectorArchivo {

	@Override
	public List<IDenominacion> leerArchivo(String path) throws NumberFormatException, IOException {
		
		FileReader fr = new FileReader(path);
		BufferedReader bf = new BufferedReader(fr);
		
		List<IDenominacion> nueva=new ArrayList<IDenominacion>();
		
		String sCadena;
		while ((sCadena = bf.readLine())!=null) {
			String[] arreglo = sCadena.split(";");
			
			for(int i=0;i<arreglo.length;i++) {
				
			String[] denominacion = arreglo[i].split(" ");
				nueva.add(new DenominacionConNivel(Integer.parseInt(denominacion[0]),denominacion[1]));
			}
		    
		}
	
		return nueva;
	}

}
