
public class DenominacionConNivel extends Denominacion implements IDenominacion {
	
	private String nivel;
	public DenominacionConNivel(int valor, String nivel) {
		super(valor);
		this.nivel = nivel;
	}
	
	public String getNivel() {
		return nivel;
	}

	@Override
	public void imprimir() {
		System.out.println(valor+ " "+nivel);
		
	}
	
}
