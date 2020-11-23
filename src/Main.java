import java.io.IOException;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	Ejercicios e=new Ejercicios();
//		System.out.println(e.redondear(124,5));
//	
//	ArrayList<Integer> lista= new ArrayList<Integer>();
//		lista.add(10);
//		lista.add(25);
//		lista.add(30);
//		lista.add(35);
//		lista.add(40);
//		lista.add(50);
//		lista.add(100);
//		System.out.println("Denominaciones: "+lista);
//		System.out.println(e.redondearConLista(135, lista));

		ArrayList<Integer> nuevalista=e.leerFichero("C:\\Users\\Daniel\\Documents\\TrabajoPracticoNCR\\src\\Archivo.txt");
		System.out.println(" lista de fichero "+nuevalista);
		System.out.println(e.redondearConLista(127, nuevalista));

		
	}

}
