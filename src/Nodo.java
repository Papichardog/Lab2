public class Nodo {
    int valor;
    Nodo siguiente;

    public Nodo(int valor) {
        this.valor = valor;
        this.siguiente = null;
    }

    public int obtenerValor() {
        return valor;
    }

    public void asignarValor(int valor) {
        this.valor = valor;
    }

    public void enlazarSiguiente(Nodo n) {
        siguiente = n;
    }

    public Nodo obtenerSiguiente() {
        return siguiente;
    }
}
