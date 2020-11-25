



public class LectorArchivoConMonedas extends LectorArchivo 
{
	@Override
	public void agregarDenominacion(String linea) 
	{
		String[] denominacion = linea.split("=");
		denominaciones.add(new DenominacionConMonedas(Integer.parseInt(denominacion[0]), 
				Integer.parseInt(denominacion[1])));
	}

}