
public class ListaInt {
	private NodoInt primero;
	public ListaInt(){}
	
	public void imprimir() {
		NodoInt n=this.primero;
		System.out.print("[");
		while(n!=null) {
			System.out.print(n.elemento+" ");
			n=n.siguiente;
			
		}
		System.out.println("]");
	}
	 void agregarElemento(int x) {
		 NodoInt nuevo = new NodoInt(x);//crea nodo
		  	nuevo.elemento = x;//asiga elemento
		  	nuevo.siguiente = this.primero;//asigna referencia al primero
		  	this.primero = nuevo;//primero pasa a ser el nuevo
		  }

	public NodoInt getPrimero() {
		return primero;
	}

	public void setPrimero(NodoInt primero) {
		this.primero = primero;
	}
	
}
