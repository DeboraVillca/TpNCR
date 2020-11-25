import java.io.IOException;
import java.util.*;
public class CalculadoraRedondeo 
{
	public static final String DENOMINACIONES_CON_NIVEL = "C:\\Users\\Daniel\\Documents\\TpNCR\\src\\denominaciones_nivel.txt";
	public int redondear(int vuelto, int denominacion)
	{
		int vueltoCortado = 0;
		
		if (denominacion <= 10) 
		{
			vueltoCortado = cortarNumero(vuelto, 1);
		}
		
		return vuelto + (denominacion - vueltoCortado);
	}
	
	private int cortarNumero(int vuelto, int digitosAmantener) 
	{
		String vueltoString = Integer.toString(vuelto);
		String vueltoCortado = vueltoString.substring(vueltoString.length()- 
				Integer.toString(digitosAmantener).length());
		
		return Integer.parseInt(vueltoCortado); 
	}
	
	public int  redondearPorNivel(int vuelto) throws NumberFormatException, IOException {
	
		List<Denominacion> denominaciones= new LectorArchivoConNivel().leerArchivo(DENOMINACIONES_CON_NIVEL);
		int i=0;
		int vueltoRedondeado=0;
		boolean redondeado=false;
		while(i<denominaciones.size() && !redondeado) {
			Denominacion denominacion = denominaciones.get(i);
			DenominacionConNivel denominacionConNivel = (DenominacionConNivel) denominacion; 
			if(denominacionConNivel.getNivel().equals("NORMAL")) {
				vueltoRedondeado= redondear(vuelto, denominacionConNivel.getValor());
				redondeado=true;
				
			}
			i++;
		}
		return vueltoRedondeado;
		
		
	}
}