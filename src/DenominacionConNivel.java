
public class DenominacionConNivel extends Denominacion
{
	private String nivel;
	
	public DenominacionConNivel(int valor, String nivel) 
	{
		super(valor);
		this.nivel = nivel;
	}

	public String getNivel() 
	{
		return nivel;
	}

	@Override
	public String toString()
	{
		return "" + valor + " " + nivel;
	}

}