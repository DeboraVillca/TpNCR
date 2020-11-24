import java.io.IOException;
import java.util.*;

public interface ILectorArchivo {
	public List<IDenominacion> leerArchivo(String path) throws NumberFormatException, IOException;
	
}
