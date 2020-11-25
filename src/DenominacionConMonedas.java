public class DenominacionConMonedas extends Denominacion 
{
	private int monedas;

	public DenominacionConMonedas(int valor, int monedas) 
	{
		super(valor);
		this.monedas = monedas;
	}

	public int getMonedas() 
	{
		return monedas;
	}

	@Override
	public String toString() 
	{
		return "" + valor + " " + monedas;
	}

	public void setMonedas(int monedas) {
		this.monedas = monedas;
	}
}