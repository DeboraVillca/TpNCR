import java.io.IOException;
import java.util.*;
public class CalculadoraRedondeo 
{
	int resta=0;
	public static final String DENOMINACIONES_CON_NIVEL = "C:\\Users\\Daniel\\Documents\\TpNCR\\src\\denominaciones_nivel.txt";
	public static final String DENOMINACIONES_CON_MONEDAS = "C:\\Users\\Daniel\\Documents\\TpNCR\\src\\denominaciones_monedas.txt";
	public int redondear(int vuelto, int denominacion)
	{
		int vueltoCortado=0;
		int numeroRedondeado=0;
		 
		 if (denominacion <= 10) 
			{
				vueltoCortado = cortarNumero(vuelto, 1);
			}
		 else {
			 vueltoCortado=cortarNumero(vuelto, 2);
			 }
		resta=(denominacion-vueltoCortado);
		numeroRedondeado=vuelto + resta ;
		return numeroRedondeado;
	}
	private int cortarNumero(int vuelto, int digitosAmantener) 
	{
		String vueltoString = Integer.toString(vuelto);
		String vueltoCortado = vueltoString.substring(vueltoString.length()- 
		digitosAmantener);
		
		return Integer.parseInt(vueltoCortado); 
	}
	public int redondearConLista(int vuelto,ArrayList<Integer> denominaciones) {
		 
		int redondeo=0;
		int dosDigitos= cortarNumero(vuelto, 2);
		boolean encontrado=false;
		int i=0;
		while(!encontrado && i<denominaciones.size()) {
			if(dosDigitos<=denominaciones.get(i)) {
				redondeo=redondear(vuelto,denominaciones.get(i));
				encontrado=true;
				
			}
			i++;
		}
		
		return redondeo;
		
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
	public int redondearPorMonedas(int vuelto) throws NumberFormatException, IOException {
		List<Denominacion> denominacionesconmonedas= new LectorArchivoConMonedas().leerArchivo(DENOMINACIONES_CON_MONEDAS);
		int i=0;
		int numeroRedondeado=0;
		boolean redondeado=false;
		while(i<denominacionesconmonedas.size() && !redondeado) {
			Denominacion denominacion= denominacionesconmonedas.get(i);
			DenominacionConMonedas denominacionconMonedas= (DenominacionConMonedas) denominacion;
			if(denominacionconMonedas.getMonedas()>=100) {
				numeroRedondeado=redondear(vuelto, denominacionconMonedas.valor);
				int s=0;
					s=	denominacionconMonedas.getMonedas()- resta;
				denominacionconMonedas.setMonedas(s);
				redondeado=true;
				System.out.println("cantidad de monedas: "+s);
			}
			i++;
		}
		return numeroRedondeado;
		
	}
}