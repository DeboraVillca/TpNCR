
public class Denominacion {
	
	protected int valor;
	public Denominacion(int valor) {
		this.valor = valor;
	}
	public int getValor() {
		return valor;
	}

		@Override
		public String toString() 
		{
			return "" + valor;
		}
}
