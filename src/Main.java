import java.io.IOException;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
	
		CalculadoraRedondeo calculadora = new CalculadoraRedondeo();
		System.out.println("Redondeo simple: "+calculadora.redondear(132,40));
		ArrayList<Integer> nueva= new ArrayList<Integer>();
		nueva.add(10);
		nueva.add(20);
		nueva.add(50);
		nueva.add(60);
		System.out.println("Redondeo con lista: "+calculadora.redondearConLista(132, nueva));
		System.out.println("Redondeo por nivel: "+calculadora.redondearPorNivel(146));
		System.out.println("Redondeo por monedas: "+calculadora.redondearPorMonedas(1197));
		
		
		
	
		
		
		
		
	}

}
