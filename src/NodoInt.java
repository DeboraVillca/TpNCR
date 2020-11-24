
public class NodoInt {

	public int valor;
	public String nivel;
	public NodoInt siguiente;

	public NodoInt() {
	}
	public NodoInt(int x) {
	}
public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public NodoInt getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(NodoInt siguiente) {
		this.siguiente = siguiente;
	}

}
