

public class LectorArchivoConNivel extends LectorArchivo 
{
	@Override
	public void agregarDenominacion(String linea) 
	{
		String[] denominacion = linea.split("=");
		denominaciones.add(new DenominacionConNivel(Integer.parseInt(denominacion[0]), 
				denominacion[1]));
	}
}