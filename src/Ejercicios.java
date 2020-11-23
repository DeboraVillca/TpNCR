import java.util.*;
import java.io.*;
public class Ejercicios {
	private NodoInt primero;
	ListaInt lista=new ListaInt();
	///EJERCICIO.01 
	public int redondear(int vuelto, int denom,int digitosAcortar){
		int ultimoDigito = cortarNumero(vuelto, digitosAcortar);
		return calcularRedondeo(vuelto, ultimoDigito, denom);
	}
	public int calcularRedondeo(int vuelto,int ultimoDigito,int denom) {
		return vuelto + (denom-ultimoDigito);
	}
	///EJERCICIO.02
	public int redondearConLista(int vuelto,ArrayList<Integer> denominaciones) {
		 
			int redondeo=0;
			int dosDigitos= cortarNumero(vuelto, 2);
			boolean encontrado=false;
			int i=0;
			while(!encontrado && i<denominaciones.size()) {
				if(dosDigitos<=denominaciones.get(i)) {
					redondeo=redondear(vuelto,denominaciones.get(i),2);
					encontrado=true;
					
				}
				i++;
			}
			
			return redondeo;
			
		}
	public int cortarNumero(int numero,int digitosAcortar) {
		String vueltoString = Integer.toString(numero);
		String ultimoCaracter = vueltoString.substring(vueltoString.length()-digitosAcortar);
		return  Integer. parseInt(ultimoCaracter);
		
	}
		
	//EJERCICIO.03
	public ArrayList<Integer> leerFichero(String path) throws NumberFormatException, IOException{
		int n=0;
		FileReader fr = new FileReader(path);
		BufferedReader bf = new BufferedReader(fr);
		
		ArrayList<Integer> nueva=new ArrayList<Integer>();
		
		String sCadena;
		while ((sCadena = bf.readLine())!=null) {
			String[] arreglo = sCadena.split(" ");
			for(int i=0;i<arreglo.length;i++) {
				n=Integer.parseInt(arreglo[i]);
				nueva.add(n);
			}
		    
		}
		return nueva;
		
	}
	
}
